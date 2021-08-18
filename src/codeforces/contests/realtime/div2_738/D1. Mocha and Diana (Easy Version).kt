package codeforces.contests.realtime.div2_738
// WA
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val (n, m1, m2) = br.readLine().split(" ").map { it.toInt() }
    val first = Array(n + 1) { -1 }
    val second = Array(n + 1) { -1 }
    var count = 0

    repeat(m1) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        first[b] = a
    }

    repeat(m2) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        second[b] = a
    }

    for (i in 1 until n) {
        for (j in i + 1..n) {
            if (find(first, i) != find(first, j) && find(second, i) != find(second, j)) {
                bw.write("$i $j")
                count++
                bw.newLine()

                first[j] = i
                second[j] = i
            }
        }
    }

    println(count)
    bw.flush()
    bw.close()
}

private fun find(a: Array<Int>, target: Int): Int {
    return if (a[target] == -1) target else find(a, a[target])
}