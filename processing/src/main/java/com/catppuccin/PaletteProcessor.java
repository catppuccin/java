package com.catppuccin;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

import com.google.gson.Gson;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

@SupportedAnnotationTypes(
        {"com.catppuccin.GeneratedPalette"}
)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class PaletteProcessor extends AbstractProcessor {

    private static final String ROOT_PKG = "com.catppuccin";
    private static final ClassName FLAVOR_CLASS = ClassName.get(ROOT_PKG, "Flavor");
    private static final ClassName COLOR_CLASS = ClassName.get(ROOT_PKG, "Color");
    private static final TypeName TO_LIST_RET = 
        ParameterizedTypeName.get(
            ClassName.get("java.util", "List"), 
                ParameterizedTypeName.get(ClassName.get(ROOT_PKG, "Pair"), 
                    ClassName.get("java.lang", "String"), ClassName.get(ROOT_PKG, "Color")
                )
            );

    private static enum Flavor {
        MOCHA("mocha", "Mocha", "MOCHA", "new Mocha()", true),
        MACCHIATO("macchiato", "Macchiato", "MACCHIATO", "new Macchiato()", true),
        FRAPPE("frappe", "Frappe", "FRAPPE", "new Frappe()", true),
        LATTE("latte", "Latte", "LATTE", "new Latte()", false);

        String displayName;
        String generatedClassName;
        String fieldName;
        String initialiser;
        boolean isDark;

        Flavor(String displayName, String generatedClassName, String fieldName, String initialiser, boolean isDark) {
            this.displayName = displayName;
            this.generatedClassName = generatedClassName;
            this.fieldName = fieldName;
            this.initialiser = initialiser;
            this.isDark = isDark;
        }
    }

    private static TypeSpec.Builder attachPalette(POJO.Flavor flavor, TypeSpec.Builder spec) {
        for (Entry<String, POJO.Color> entry : flavor.getColors().entrySet()) {
            POJO.Color color = entry.getValue();
            POJO.RGB rgb = color.getRGB();

            MethodSpec method = MethodSpec
                    .methodBuilder(entry.getKey())
                    .addModifiers(Modifier.PUBLIC)
                    .addCode("return new Color($L, $L, $L);", rgb.getR(), rgb.getG(), rgb.getB())
                    .addAnnotation(Override.class)
                    .returns(COLOR_CLASS)
                    .build();

            spec.addMethod(method);
        }

        return spec;
    }

    private static MethodSpec toListImpl(POJO.Flavor flavor) {
        MethodSpec.Builder builder = MethodSpec
                .methodBuilder("toList")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(Override.class)
                .addStatement("List<com.catppuccin.Pair<String, com.catppuccin.Color>> out = new java.util.ArrayList<>()")
                .returns(TO_LIST_RET);

        for (Entry<String, POJO.Color> entry : flavor.getColors().entrySet()) {
            POJO.Color color = entry.getValue();
            POJO.RGB rgb = color.getRGB();
            builder.addStatement("out.add(new com.catppuccin.Pair<>($S, new Color($L, $L, $L)))", entry.getKey(), rgb.getR(), rgb.getG(), rgb.getB());
        }

        builder.addStatement("return out");

        return builder.build();
    }

    private static TypeSpec buildStoredPalette(POJO.Flavor pflavor, Flavor flavor) {
        return attachPalette(pflavor, TypeSpec
                .classBuilder(flavor.generatedClassName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addSuperinterface(FLAVOR_CLASS)
                .addMethod(MethodSpec
                        .methodBuilder("name")
                        .addModifiers(Modifier.PUBLIC)
                        .addCode("return $S;", flavor.displayName)
                        .addAnnotation(Override.class)
                        .returns(String.class)
                        .build()
                )
                .addMethod(MethodSpec
                        .methodBuilder("isLight")
                        .addModifiers(Modifier.PUBLIC)
                        .addCode("return $L;", !flavor.isDark)
                        .addAnnotation(Override.class)
                        .returns(boolean.class)
                        .build()
                )
                .addMethod(MethodSpec
                        .methodBuilder("isDark")
                        .addModifiers(Modifier.PUBLIC)
                        .addCode("return $L;", flavor.isDark)
                        .addAnnotation(Override.class)
                        .returns(boolean.class)
                        .build()
                ))
                .addMethod(toListImpl(pflavor))
                .build();
    }

    private static FieldSpec buildStoredField(Flavor flavor) {
        ClassName className = ClassName.get("", flavor.generatedClassName);
        return FieldSpec
                .builder(className, flavor.fieldName, Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .initializer(flavor.initialiser)
                .build();
    }

    private POJO.Root loadPalette() throws IOException {
        String palettePath = processingEnv.getOptions().get("palettePath");
        Path path = Paths.get(palettePath);
        String jsonString = new String(Files.readAllBytes(path));

        Gson gson = new Gson();
        POJO.Root json = gson.fromJson(jsonString, POJO.Root.class);

        return json;
    }

    private void processElement(Element element) throws IOException {
        GeneratedPalette paletteAnnotation = element.getAnnotation(GeneratedPalette.class);

        if (element.getKind() != ElementKind.CLASS) {
            error("The annotation @GeneratedPalette can only be applied on class: ", element);
            return;
        }

        POJO.Root json = loadPalette();

        ClassName holderClassName = ClassName.bestGuess(paletteAnnotation.target());
        TypeSpec holderClass = TypeSpec.classBuilder(holderClassName.simpleName())
                .addModifiers(Modifier.PUBLIC)
                .addType(buildStoredPalette(json.mocha, Flavor.MOCHA))
                .addField(buildStoredField(Flavor.MOCHA))
                .addType(buildStoredPalette(json.macchiato, Flavor.MACCHIATO))
                .addField(buildStoredField(Flavor.MACCHIATO))
                .addType(buildStoredPalette(json.frappe, Flavor.FRAPPE))
                .addField(buildStoredField(Flavor.FRAPPE))
                .addType(buildStoredPalette(json.latte, Flavor.LATTE))
                .addField(buildStoredField(Flavor.LATTE))
                .build();

        JavaFile javaFile = JavaFile.builder(ROOT_PKG, holderClass).build();
        JavaFileObject sourceFile = processingEnv.getFiler().createSourceFile(paletteAnnotation.target());

        try (Writer writer = sourceFile.openWriter()) {
            writer.write(javaFile.toString());
        }
    }

    private void error(String msg, Element e) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, msg, e);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (annotations.isEmpty()) {
            return false;
        }

        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(GeneratedPalette.class);

        for (Element element : elements) {

            try {
                processElement(element);
            } catch (IOException ex) {
                error(ex.toString(), null);
                return false;
            }
        }

        return true;
    }
}
