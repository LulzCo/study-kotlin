package Basic_Syntex

fun describe(obj: Any) : String =
    when (obj) {
        1           -> "one"
        "Hello"     -> "greeting"
        is Long     -> "long"
        !is String  -> "not a string"
        else        -> "unknown"
    }

fun main() {
    println(describe(0x1123123123123213));
}