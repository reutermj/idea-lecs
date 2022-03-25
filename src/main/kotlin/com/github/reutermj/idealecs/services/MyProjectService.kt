package com.github.reutermj.idealecs.services

import com.intellij.openapi.project.Project
import com.github.reutermj.idealecs.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
