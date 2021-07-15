package codeforces.contests.virtual.div2_edu_109

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }


        if (inputs.contentEquals(inputs.sortedArray())) {
            bw.write("0")
        } else if (inputs[0] == 1 || inputs.last() == n) {
            bw.write("1")
        } else if (inputs[0] == n && inputs.last() == 1) {
            bw.write("3")
        } else {
            bw.write("2")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
