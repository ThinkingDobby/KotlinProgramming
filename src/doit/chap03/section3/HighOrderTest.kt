package chap03.section3

fun main() {
    val result: Int
    val result2: Int
    val multi: (Int, Int) -> Int = { x, y -> x * y }

    result = multi(10, 20)
    println("result: $result")

    result2 = multi2(10,20)
    println("result2: $result2")

    greet()
    println(square(3))
}

val multi2: (Int, Int) -> Int = { x, y ->
    println("x * y")
    x * y
}

val greet: () -> Unit = {println("Hello World")}

val square: (Int) -> Int = {x -> x * x}

val nestedLambda: () -> () -> Unit = {{println("nested")}}
