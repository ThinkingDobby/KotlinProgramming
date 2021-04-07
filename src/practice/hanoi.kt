package practice

import java.io.*

private var count = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    hanoi(n, 1, 2, 3)

    bw.write("$count")

    bw.flush()
    bw.close()
}

private fun hanoi(n: Int, from: Int, tmp: Int, to: Int) {
    if (n == 0) return
    hanoi(n - 1, from, to, tmp)
    count++
    hanoi(n - 1, tmp, from, to)
}