package codeforces.contests.virtual.div2_edu_109

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val k = br.readLine().toInt()

        val gcd = gcd(k, 100)

        bw.write("${100 / gcd}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
