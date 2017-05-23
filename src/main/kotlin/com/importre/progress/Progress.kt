package com.importre.progress

import java.util.*
import kotlin.concurrent.timer

class Progress @JvmOverloads constructor(
    var message: String = messageLoad,
    val frames: List<String> = Frames.dots8,
    val done: String = Frames.done) : Progressable {

    private var progress = 0
    private var job: Timer? = null

    override fun start(block: () -> Unit) {
        clearLine()
        job?.cancel()
        job = timer(daemon = true, period = 100L) {
            val spinner = frames[++progress % frames.size]
            render(spinner, message)
        }
        block()
        stop()
    }

    private fun stop() {
        job?.cancel()
        render(done, message + "\n")
    }

    private fun render(spinner: String, message: String) {
        clearLine()
        print("$spinner $message")
    }
}
