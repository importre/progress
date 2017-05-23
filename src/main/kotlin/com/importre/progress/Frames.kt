package com.importre.progress

object Frames {
    @JvmStatic val done = "\u2714"
    @JvmStatic val dots1 = "⠁⠂⠄⡀⢀⠠⠐⠈".map(Char::toString)
    @JvmStatic val dots8 = "⣾⣽⣻⢿⡿⣟⣯⣷".map(Char::toString)
    @JvmStatic val arrows = "←↖↑↗→↘↓↙".map(Char::toString)
    @JvmStatic val hRect = "▉▊▋▌▍▎▏▎▍▌▋▊▉".map(Char::toString)
    @JvmStatic val vRect = "▁▃▄▅▆▇█▇▆▅▄▃".map(Char::toString)
}
