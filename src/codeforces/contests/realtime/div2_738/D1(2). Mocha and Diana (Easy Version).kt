package codeforces.contests.realtime.div2_738
// 참조한 코드
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val (n, m1, m2) = br.readLine().split(" ").map { it.toInt() }
    val first = Array(n + 1){it}
    val second = Array(n + 1){it}

    repeat(m1) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        union(first, a, b)
    }

    repeat(m2) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        union(second, a, b)
    }

    val new = mutableListOf<Pair<Int, Int>>()

    for (i in 1 until n) {
        for (j in i + 1..n) {
            if (!same(first, i, j) && !same(second, i, j)) {
                union(first, i, j)
                union(second, i, j)

                new.add(i to j)
            }
        }
    }

    bw.write("${new.size}")
    bw.newLine()
    new.forEach { bw.write("${it.first} ${it.second}\n") }

    bw.flush()
    bw.close()
}

private fun find(arr: Array<Int>, target: Int): Int {
    if (arr[target] == target) return target
    else return find(arr, arr[target])
}

private fun same(arr: Array<Int>, a: Int, b: Int): Boolean {
    return find(arr, a) == find(arr, b)
}

private fun union(arr: Array<Int>, a: Int, b: Int): Boolean {
    val ar = find(arr, a)
    val br = find(arr, b)
    if (ar != br) {
        arr[br] = ar
        return true
    } else return false
}