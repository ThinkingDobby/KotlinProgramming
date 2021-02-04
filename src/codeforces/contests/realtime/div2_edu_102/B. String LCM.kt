package codeforces.contests.realtime.div2_edu_102

import java.io.*
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val q = br.readLine().toInt()
    repeat(q) {
        val s = br.readLine()
        val t = br.readLine()

        val a = s.length
        val b = t.length

        val num = a * b / gcd(a, b)

        val ans1 = StringBuilder()
        val ans2 = StringBuilder()

        for (i in 0 until num / a) {
            ans1.append(s)
        }
        for (i in 0 until num / b) {
            ans2.append(t)
        }

        if (ans1.toString() == ans2.toString()) {
            bw.write("$ans1")
        } else {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}