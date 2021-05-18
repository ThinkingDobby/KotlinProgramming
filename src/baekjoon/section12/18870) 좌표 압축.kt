package baekjoon.section12

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() to it }
    inputs.sortBy { it.first }

    val storeInputs = Array(n) { 0 }

    var now = 0
    for (i in 0 until n) {
        if (i == 0) {
            storeInputs[inputs[i].second] = now
        } else {
            if (inputs[i].first == inputs[i - 1].first) {
                storeInputs[inputs[i].second] = now
            } else {
                now++
                storeInputs[inputs[i].second] = now
            }
        }
    }

    storeInputs.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
}