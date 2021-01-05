package practice.baekjoon.section5

import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = Integer.parseInt(br.readLine())
    val list = ArrayList<Double>(n)

    val st = StringTokenizer(br.readLine())

    repeat(n) {
        val tmp = st.nextToken().toDouble()
        list.add(tmp)
    }

    val max = list.max()
    repeat(n) {
        list[it] = list[it] / max!! * 100
    }

    bw.write("${list.average()}")
    bw.flush()
    bw.close()
}