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

class HashTask extends DefaultTask {
    def algorithm = 'MD5'
    def resources = project.fileTree(project.processResources.destinationDir)
    @TaskAction
    def hash() {
        def md = java.security.MessageDigest.getInstance(algorithm)
        resources.visit {
            def src = it.file
            if (src.file) {
                def file = new File(src.parent, src.name + '.' + algorithm.toLowerCase())
                def digest = md.digest(src.bytes).collect { String.format('%02x', it) }.join()
                file.write(digest)
            }
        }
    }
}

