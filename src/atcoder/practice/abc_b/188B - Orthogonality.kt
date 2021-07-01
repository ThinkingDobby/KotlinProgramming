package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st1 = StringTokenizer(br.readLine())
    val a = Array(n) { st1.nextToken().toInt() }

    val st2 = StringTokenizer(br.readLine())
    val b = Array(n) { st2.nextToken().toInt() }

    var sum = 0
    for (i in 0 until n) {
        sum += a[i] * b[i]
    }

    if (sum == 0) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.flush()
    bw.close()
}