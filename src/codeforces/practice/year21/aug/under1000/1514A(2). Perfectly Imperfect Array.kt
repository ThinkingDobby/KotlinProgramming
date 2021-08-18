package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        bw.write(if (br.readLine().split(" ").map { it.toInt() }
                        .any { x -> !(1..100).any { y -> y * y == x } }) "YES" else "NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
