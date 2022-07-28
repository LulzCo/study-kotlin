package Basic_Syntex

fun main() {
    val x = 10;
    val y = 9;

    if (x in 1..y+1) {
        println("fits in range");
    }

    val list = listOf("a", "b", "c");
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range");
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices rangee, too")
    }

    for (x in 1..5) {
        println(x);
    }
    println()
    for (x in 1..5 step 2) {
        println(x);
    }
    println()
    for (x in 9 downTo 0 step 3) {
        println(x);
    }

}
