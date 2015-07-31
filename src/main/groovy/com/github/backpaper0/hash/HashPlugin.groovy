package com.github.backpaper0.hash

import org.gradle.api.*
import org.gradle.api.plugins.*
import org.gradle.api.tasks.*

class HashPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.pluginManager.apply(JavaPlugin.class)
        project.tasks.create('hash', HashTask.class)
        project.classes.dependsOn project.hash
        project.hash.dependsOn project.processResources
    }
}

