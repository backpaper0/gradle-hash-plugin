gradle hash plugin
==================================================

## Overview

This plugin save to file that hash value
 of copied file by processResources task([JavaPlugin](https://docs.gradle.org/current/userguide/java_plugin.html)).

## Usage

First, install this plugin to maven local repository.

```sh
git clone https://github.com/backpaper0/gradle-hash-plugin.git gradle-hash-plugin
cd gradle-hash-plugin
gradle install
```

And, edit your project's `build.gradle`.

```gradle
buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath 'com.github.backpaper0:gradle-hash-plugin:1.0-SNAPSHOT'
    }
}

apply plugin: 'com.github.backpaper0.hash'
```

## License

[Apache License Version 2.0](apache.org/licenses/LICENSE-2.0.txt)

## Author

[@backpaper0](https://twitter.com/backpaper0)

