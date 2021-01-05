package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val tasks = Array(m) { st2.nextToken().toInt() }

    var count = 0L
    var now = 1
    for (i in 0 until m) {
        if (now <= tasks[i]) {
            count += tasks[i] - now
        } else {
            count += n - now + tasks[i]
        }
        now = tasks[i]
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}