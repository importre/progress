package com.importre.progress

interface Progressable {
    fun start(block: () -> Unit)
}
