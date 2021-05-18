package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(12) { st.nextToken().toInt() }.sortedArrayDescending()

    var i = 0
    var sum = 0
    while (true) {
        if (i == 12) {
            if (sum < k) i = -1
            break
        }
        if (sum >= k) break
        sum += inputs[i]
        i++
    }

    bw.write("$i")

    bw.flush()
    bw.close()
}