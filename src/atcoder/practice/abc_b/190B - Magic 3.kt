package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val s = st1.nextToken().toInt()
    val d = st1.nextToken().toInt()

    var damaged = false
    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        val x = st2.nextToken().toInt()
        val y = st2.nextToken().toInt()

        if (x < s && y > d) {
            damaged = true
            break
        }
    }

    if (damaged) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.flush()
    bw.close()
}