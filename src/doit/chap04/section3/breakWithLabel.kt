package chap04.section3

fun main() {
    labelBreak()
}

fun labelBreak() {
    println("labelBreak")
    first@ for (i in 1..5) {        // 라벨: 코드의 특정 위치 임의로 표시 - 꼭 람다식에만 사용할 필요는 없음
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i: $i, j: $j")
        }
        println("After for j")
    }
    println("After for i")
}