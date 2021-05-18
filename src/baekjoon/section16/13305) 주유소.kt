package baekjoon.section16

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st1 = StringTokenizer(br.readLine())
    val distances = Array(n - 1) { st1.nextToken().toLong() }

    val st2 = StringTokenizer(br.readLine())
    val cities = Array(n) { st2.nextToken().toLong() }

    var min = cities[0]
    var count = distances[0]
    var sum = min * count
    for (i in 1 until n - 1) {
        if (cities[i] < min) {
            min = cities[i]
            count = distances[i]
            sum += min * count
        } else {
            count = distances[i]
            sum += min * count
        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}