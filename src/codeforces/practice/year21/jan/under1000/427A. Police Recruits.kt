package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var officers = 0
    var crimeCount = 0

    val st = StringTokenizer(br.readLine())
    repeat(n) {
        val tmp = st.nextToken().toInt()
        officers += tmp
        if (officers < 0) {
            crimeCount += Math.abs(officers)
            officers = 0
        }
    }

    bw.write("$crimeCount")

    bw.flush()
    bw.close()
}