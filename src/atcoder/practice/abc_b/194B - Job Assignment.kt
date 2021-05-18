package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var ans = 0

    val aArray = mutableListOf<Pair<Int, Int>>()
    val bArray = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        aArray.add(a to i)
        bArray.add(b to i)
    }

    aArray.sortBy { it.first }
    bArray.sortBy { it.first }

    if (aArray[0].second != bArray[0].second) {
        ans = Math.max(aArray[0].first, bArray[0].first)
    } else {
        val temp = Math.min(Math.max(aArray[0].first, bArray[1].first),
                Math.max(aArray[1].first, bArray[0].first))
        ans = Math.min(temp, aArray[0].first + bArray[0].first)
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}
