package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val ans = mutableListOf<Char>()

        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        var aCount = 0
        var bCount = 0
        repeat(n) {
            if (aCount == a) {
                bCount = 0
                aCount = 0
            }
            if (bCount == b) ans.add((bCount - 1 + 97).toChar())
            else {
                ans.add((bCount + 97).toChar())
                bCount++
            }
            aCount++
        }

        ans.forEach { bw.write("$it") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}