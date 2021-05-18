package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())
    val firstInputs = Array(n) { st1.nextToken().toInt() }

    val st2 = StringTokenizer(br.readLine())
    val secondInputs = Array(n) { st2.nextToken().toInt() }

    val firstMax = firstInputs.max()!!
    val secondMin = secondInputs.min()!!

    if (firstMax > secondMin) bw.write("0")
    else bw.write("${secondMin - firstMax + 1}")

    bw.flush()
    bw.close()
}