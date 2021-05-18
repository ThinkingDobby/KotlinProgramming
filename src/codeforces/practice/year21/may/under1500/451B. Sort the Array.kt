package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }
    val sortedInputs = inputs.sortedArray()

    var start = 0
    var end = 0
    var first = true
    var count = 0

    for (i in 0 until n) {
        if (first && inputs[i] != sortedInputs[i]) {
            start = inputs[i]
            first = false
        }
        if (!first && inputs[i] != sortedInputs[i]) {
            end = inputs[i]
        }
        if (i >= 2) {
            if (inputs[i - 2] < inputs[i - 1] && inputs[i - 1] > inputs[i]) count++
        }
    }

    if (count > 1) {
        bw.write("no")
    } else {
        if (inputs.contentEquals(sortedInputs)) {
            bw.write("yes")
            bw.newLine()
            bw.write("1 1")
        } else {
            if (inputs.indexOf(start) == sortedInputs.indexOf(end) && inputs.indexOf(end) == sortedInputs.indexOf(start)) {
                bw.write("yes")
                bw.newLine()
                bw.write("${inputs.indexOf(start) + 1} ${inputs.indexOf(end) + 1}")
            } else {
                bw.write("no")
            }
        }
    }

    bw.flush()
    bw.close()
}