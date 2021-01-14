/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.lightTree

import java.io.File

private fun File.iterateKtFiles(): Sequence<File> {
    val excludeDirs = setOf(
        ".DS_Store",
        ".idea",
        "dist",
        "local",
        "out",
        "testdata",
        "resources",
        "node_modules"
    )
    return walkTopDown()
        .onEnter { file ->
            val name = file.name.toLowerCase()
            if (name in excludeDirs) {
                return@onEnter false
            }

            if (name == "build" &&
                (File(file.parentFile, "build.gradle.kts").exists() || File(file.parentFile, "build.gradle").exists())) {
                // Probably Gradle Build Dir
                return@onEnter false
            }

            if (name == "target" && File(file.parentFile, "pom.xml").exists()) {
                // Probably Maven Build Dir
                return@onEnter false
            }

            true
        }
        .filter {
            it.isFile && it.extension == "kt"
        }
}


fun String.walkKtFiles(f: (File) -> Unit) {
    val root = File(this)
    root.iterateKtFiles().forEach(f)
}

fun String.walkTopDownWithTestData(f: (File) -> Unit) {
    val root = File(this)
    for (file in root.walkTopDown()) {
        if (file.isDirectory) continue
        if (file.extension != "kt") continue

        f(file)
    }
}