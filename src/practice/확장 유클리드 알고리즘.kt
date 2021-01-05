package practice

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n1 = br.readLine().toInt()
    val n2 = br.readLine().toInt()

    val gcd = calcGCD(n1, n2)
    val n1Factor = n1 / gcd
    val n2Factor = n2 / gcd
    val lcm = n1Factor * n2Factor * gcd

    bw.write("$gcd")    // 최대공약수
    bw.newLine()
    bw.write("$lcm")    // 최소공배수

    bw.flush()
    bw.close()
}

private fun calcGCD(n1: Int, n2: Int): Int {
    val r = arrayOf(n1, n2)
    val s = arrayOf(1, 0)
    val t = arrayOf(0, 1)
    var q: Int
    var remainder = r[0] % r[1]


    while (remainder > 0) {
        q = r[0] / r[1]

        r[0] = r[1]
        r[1] = remainder

        val tempS = s[0]
        s[0] = s[1]
        s[1] = tempS - s[1] * q
        val tempT = t[0]
        t[0] = t[1]
        t[1] = tempT - t[1] * q

        remainder = r[0] % r[1]
    }

    return r[1]
}
