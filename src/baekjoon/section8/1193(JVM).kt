package practice.baekjoon.section8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()

    var i = 1
    var cnt = 0
    var ans = ""

    a@while (true) {
        if (i % 2 == 0) for (j in 1..i) {
            cnt++
            if (cnt == x) {
                ans = "$j/${i + 1 - j}"
                break@a
            }
        } else for (j in 1..i) {
            cnt++
            if (cnt == x) {
                ans = "${i + 1 - j}/$j"
                break@a
            }
        }
        i++
    }

    bw.write(ans)
    bw.flush()
    bw.close()
}