package codeforces.practice.year20.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val homeUniforms = Array(n) { 0 }
    val guestUniforms = Array(n) { 0 }

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        homeUniforms[i] = st.nextToken().toInt()
        guestUniforms[i] = st.nextToken().toInt()
    }

    var count = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (homeUniforms[i] == guestUniforms[j]) {
                count++
            }
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}