package codeforces.practice.year21.jan.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val answers = mutableListOf<Int>()
    for (i in 3 until 100000000) {
        if ((180 * (i - 2)) % i == 0) {
            answers.add(((180 * (i.toLong() - 2)) / i.toLong()).toInt())
        }
    }

    val t = br.readLine().toInt()
    repeat(t) {
        val a = br.readLine().toInt()
        if (a in answers) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}