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
    String mocha = Palette.MOCHA.name(); // mocha
    String mochaBaseHex = Palette.MOCHA.base().hex(); // 1e1e2e
    int[] mochaBaseRGB = Palette.MOCHA.base().components(); // [30, 30, 46]

    // loop through just frappé
    for (Pair<String, Color> colourPair : Palette.FRAPPE.toList()) {
      String name = colourPair.key();
      Color colour = colourPair.value();
      System.out.println(name + ": " + colour.hex());
    }

    // loop through every colour
    for (Flavour flavour : Palette.toList()) {
      System.out.println("Flavour: " + flavour.name());
      for (Pair<String, Color> colourPair : flavour.toList()) {
        String name = colourPair.key();
        Color colour = colourPair.value();
        System.out.println(name + ": " + colour.hex());
      }
    }
  }
}
```

## Contributing

If you are looking to contribute, please read through our
[CONTRIBUTING.md](https://github.com/catppuccin/.github/blob/main/CONTRIBUTING.md) first!

## 💝 Thanks to

- [Hamothy](https://github.com/sgoudham)
- [nullishamy](https://github.com/nullishamy)

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
