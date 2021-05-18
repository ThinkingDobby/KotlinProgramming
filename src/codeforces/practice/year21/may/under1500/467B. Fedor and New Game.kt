package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val inputs = Array(m) { br.readLine().toInt() }
    val fedor = br.readLine().toInt()

    var totalCount = 0
    for (i in inputs) {
        var count = 0
        val temp = fedor xor i
        for (j in temp.toString(2)) {
            if (j == '1') count++
        }
        if (count <= k) totalCount++
    }

    bw.write("$totalCount")

    bw.flush()
    bw.close()
}