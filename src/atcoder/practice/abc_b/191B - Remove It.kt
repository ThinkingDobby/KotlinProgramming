package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val inputs = mutableListOf<Int>()
    val st2 = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        val tmp = st2.nextToken().toInt()
        if (tmp != x) inputs.add(tmp)
    }

    inputs.forEach { bw.write("$it ") }

    bw.flush()
    bw.close()
}