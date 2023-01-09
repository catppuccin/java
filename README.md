<h3 align="center">
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/logos/exports/1544x1544_circle.png" width="100" alt="Logo"/><br/>
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
	Catppuccin for <a href="https://www.java.com/en/">Java</a>
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
</h3>

<p align="center">
	<a href="https://github.com/catppuccin/java/stargazers"><img src="https://img.shields.io/github/stars/catppuccin/java?colorA=363a4f&colorB=b7bdf8&style=for-the-badge"></a>
	<a href="https://github.com/catppuccin/java/issues"><img src="https://img.shields.io/github/issues/catppuccin/java?colorA=363a4f&colorB=f5a97f&style=for-the-badge"></a>
	<a href="https://github.com/catppuccin/java/contributors"><img src="https://img.shields.io/github/contributors/catppuccin/java?colorA=363a4f&colorB=a6da95&style=for-the-badge"></a>
  <a href="https://search.maven.org/artifact/com.catppuccin/catppuccin-palette"><img src="https://img.shields.io/maven-central/v/com.catppuccin/catppuccin-palette?colorA=363a4f&colorB=a6da95&style=for-the-badge"></a>
</p>

## Installation

Be sure to replace the **VERSION** key below with the version shown above!

### Maven

```xml
<!-- https://mvnrepository.com/artifact/com.catppuccin/catppuccin-palette -->

<dependency>
  <groupId>com.catppuccin</groupId>
  <artifactId>catppuccin-palette</artifactId>
  <version>VERSION</version>
</dependency>
```

### Gradle

```gradle
repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.catppuccin/catppuccin-palette
    implementation group: 'com.catppuccin', name: 'catppuccin-palette', version: 'VERSION'
}
```

### Binaries

If you choose not to use a build tool, pre-built `.jar` files are available with every
single [release](https://github.com/catppuccin/java/releases).

## Usage

```java
package com.catppuccin;

public class Main {
  public static void main(String[] args) {
    String mocha = Palette.MOCHA.getName(); // mocha
    String mochaBaseHex = Palette.MOCHA.getBase().getHex(); // 1e1e2e
    int[] mochaBaseRGB = Palette.MOCHA.getBase().getRGBComponents(); // [30, 30, 46]

    // loop through just frappé
    for (Pair<String, Color> colourPair : Palette.FRAPPE.toList()) {
      String name = colourPair.getKey();
      Color colour = colourPair.getValue();
      System.out.println(name + ": " + colour.getHex());
    }

    // loop through every colour
    for (Flavour flavour : Palette.toList()) {
      System.out.println("Flavour: " + flavour.getName());
      for (Pair<String, Color> colourPair : flavour.toList()) {
        String name = colourPair.getKey();
        Color colour = colourPair.getValue();
        System.out.println(name + ": " + colour.getHex());
      }
    }
  }
}
```

## Contributing

If you are looking to contribute, please read through our
[CONTRIBUTING.md](https://github.com/catppuccin/.github/blob/main/CONTRIBUTING.md) first!

### Development

This project uses the build tool [Maven](https://maven.apache.org/) from the java ecosystem. It is *highly* recommended
to develop using [Intellij IDEA](https://www.jetbrains.com/idea/) as it will allow you to take advantage of its
integration with maven tooling.

The project can be built using the command:

```shell
./mvnw clean package
```

and running tests is as simple as:

```shell
./mvnw test
```

A great 5-minute introduction to Maven can be
found [here](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

### CI / CD

This project has a GitHub actions workflow to automatically build binaries and deploy to maven central. The workflows
are stored at [.github/workflows](.github/workflows)

## 💝 Thanks to

- [Hamothy](https://github.com/sgoudham)

&nbsp;

<p align="center">
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/footers/gray0_ctp_on_line.svg?sanitize=true" />
</p>

<p align="center">
	Copyright &copy; 2023-present <a href="https://github.com/catppuccin" target="_blank">Catppuccin Org</a>
</p>

<p align="center">
	<a href="https://github.com/catppuccin/catppuccin/blob/main/LICENSE"><img src="https://img.shields.io/static/v1.svg?style=for-the-badge&label=License&message=MIT&logoColor=d9e0ee&colorA=363a4f&colorB=b7bdf8"/></a>
</p>
