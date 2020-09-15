package com.github.yd1722.ddblint.services

import com.intellij.openapi.project.Project
import com.github.yd1722.ddblint.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
