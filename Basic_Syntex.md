# Kotlin docs

### Hello, world

```kotlin
package Basic_Syntex

fun main() {
  println(Hello, World!!)
}
```

### Function(함수)

```kotlin
package Basic_Syntex

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

### variables(변수)

```kotlin
package Basic_Syntex

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

### class(클래스)

```kotlin
package Basic_Syntex

open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun main() {
    var rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}
```

**상속을 사용하기 위해서는 open 키워드 사용**

