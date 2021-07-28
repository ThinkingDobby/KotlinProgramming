package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        val input = br.readLine()

        val first = input.count { if (x > 0) it == 'R' else it == 'L' } >= Math.abs(x)
        val second = input.count { if (y > 0) it == 'U' else it == 'D' } >= Math.abs(y)

        if (first && second) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
