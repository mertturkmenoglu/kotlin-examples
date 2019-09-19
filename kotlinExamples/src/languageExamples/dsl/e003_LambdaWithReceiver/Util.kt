package languageExamples.dsl.e003_LambdaWithReceiver

inline fun <T> T.myApply(block: T.() -> Unit): T {
    block()
    return this
}