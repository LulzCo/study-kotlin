package Basic_Syntex

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println(maxOf(1,2))
    println(maxOf2(2,3))
}