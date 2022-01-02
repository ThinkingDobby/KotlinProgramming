package codeforces.contests.virtual.div3_748

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val inputs = br.readLine().split(" ").map { it.toInt() }
        for (i in inputs) {
            if (i == inputs.max()) {
                if (inputs.count { it == i } > 1) bw.write("1 ")
                else bw.write("0 ")
            } else {
                bw.write("${inputs.max()!! + 1 - i} ")
            }
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
