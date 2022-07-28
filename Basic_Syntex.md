# Kotlin docs

### Hello, world

```kotlin
fun main() {
  println(Hello, World!!)
}
```



### Function(함수)

```kotlin
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
```

return 값이 없는 경우 Unit 사용



### Variables(변수)

```kotlin
var a: Int = 1		// 정해진 자료형만 초기화 가능
var b = 3					// 정해진 자료형 존재하지 않음
//var c: Int			// err 발생
//c = 3						// err 발생

fun main() {
    var c: Int
    c = 3
}
```

전역에서는 초기화까지 해야함

**함수 내에서는 선언도 가능 but, 자료형 선언 필수**



```kotlin
///...
var a: Int = 3
val b: Int = 4

a = 4			// (O)
b = 3			// (X)
///...
```

var(variable): 값 변경 가능

val(value): 값 변경 불가능



### Class(클래스)

```kotlin
open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}
```

**상속을 사용하기 위해서는 open 키워드 사용**



### String templates

```kotlin
fun main() {
    var a = 1
    val s1 = "a is ${a}"
    println(s1)
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is ${a}"
    println(s2)
}
```



### if

```kotlin
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b
```

같은 의미의 함수



### for

```kotlin
val items = listOf("apple", "banana", "kiwifruit")
for (item in items) {
  println(item)
}
for (index in items.indices) {
  println(items[index])
}
```



### while

```kotlin
val items = listOf("apple", "banana", "kiwifruit")
var index = 0
while (index < items.size) {
	println(items[index])
  index++
}
```



### when

```
fun describe(obj: Any) : String =
    when (obj) {
        1           -> "one"
        "Hello"     -> "greeting"
        is Long     -> "long"
        !is String  -> "not a string"
        else        -> "unknown"
    }
```

switch와 같은 개념
