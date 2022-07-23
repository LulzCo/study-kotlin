fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("두 수의 합은 ${a + b}입니다")
}

fun main() {
    val a = sum(1, 2)
    println(a)
    printSum(1, 2)
}
