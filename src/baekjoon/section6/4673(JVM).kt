package practice.baekjoon.section6

fun d(n: Int): Int {
    val new = n.toString()
    var sum = 0
   for (i in 0 until new.length) {
        sum += new[i].toInt() - 48
    }

    return (sum + n)
}

fun main() {
    val arr = Array(10001){0}
    for (i in 0..10000) {
        if (d(i) < 10001) arr[d(i)] += 1
    }
    for (j in 0..10000) if (arr[j] == 0) println(j)
}