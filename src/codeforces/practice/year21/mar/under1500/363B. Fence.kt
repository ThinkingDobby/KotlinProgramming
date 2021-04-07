package codeforces.practice.year21.mar.under1500
// TLE
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val k = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val inputs = Array(n) { st2.nextToken().toInt() }

    val calc = Array(n - k + 1) { 0 }
    for (i in 0 until n - k + 1) {
        for (j in i until i + k) {
            calc[i] += inputs[j]
        }
    }

    bw.write("${calc.indexOf(calc.min()) + 1}")

    bw.flush()
    bw.close()
}