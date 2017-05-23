package com.importre.example

import com.importre.crayon.blue
import com.importre.crayon.bold
import com.importre.crayon.green
import com.importre.progress.Frames
import com.importre.progress.progress

fun main(args: Array<String>) {

    progress {
        // long-term job
        Thread.sleep(1500)
    }

    progress(message = "",
        frames = Frames.dots8.map(String::blue),
        done = Frames.done.green()) {

        // long-term job
        (0..100).forEach {
            message = "$it%".bold()
            Thread.sleep(50)
        }
    }
}
