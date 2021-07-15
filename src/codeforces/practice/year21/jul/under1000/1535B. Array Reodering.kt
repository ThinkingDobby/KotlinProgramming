package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }.sortedBy { it % 2 == 1 }

        var sum = 0
        var start = 0
        for (i in 0 until n) {
            if (inputs[i] % 2 != 0) {
                start = i
                break
            }
        }

        for (i in 0 until start) {
            sum += n - i - 1
        }

        for (i in start until n + 1) {
            for (j in i + 1 until n) {
                if (gcd(inputs[i], inputs[j]) != 1) sum++
            }
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}