gradle hash plugin
==================================================

## Overview

This plugin save to file that hash value
 of copied file by processResources task([JavaPlugin](https://docs.gradle.org/current/userguide/java_plugin.html)).

## Usage

Edit your project's `build.gradle`.

```gradle
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.github.backpaper0:gradle-hash-plugin:1.0"
  }
}

apply plugin: "com.github.backpaper0.hash"
```

## License

[Apache License Version 2.0](apache.org/licenses/LICENSE-2.0.txt)

## Author

[@backpaper0](https://twitter.com/backpaper0)

