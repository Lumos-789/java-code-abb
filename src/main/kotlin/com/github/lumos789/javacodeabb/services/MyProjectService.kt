package com.github.lumos789.javacodeabb.services

import com.github.lumos789.javacodeabb.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
