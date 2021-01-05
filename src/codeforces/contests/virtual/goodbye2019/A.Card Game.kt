package codeforces.contests.virtual.goodbye2019

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val first = st.nextToken().toInt()
        val second = st.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val firstCards = Array(first) { st2.nextToken().toInt() }

        val st3 = StringTokenizer(br.readLine())
        val secondCards = Array(second) { st3.nextToken().toInt() }

        if (firstCards.max()!! > secondCards.max()!!) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}