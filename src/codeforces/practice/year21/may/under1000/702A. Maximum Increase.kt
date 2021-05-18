package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = mutableListOf<Int>()
    for (i in 0 until n) {
        inputs.add(st.nextToken().toInt())
    }
    inputs.add(-1)

    var max = -1
    var count = 1
    for (i in 0 until n) {
        if (inputs[i] < inputs[i + 1]) {
            count++
        } else {
            if (count > max) max = count
            count = 1
        }
    }

    bw.write("$max")

    bw.flush()
    bw.close()
}