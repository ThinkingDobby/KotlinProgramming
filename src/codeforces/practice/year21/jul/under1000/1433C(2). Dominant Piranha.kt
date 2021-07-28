package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }
        val max = inputs.max()
        val maxIndices = inputs.indices.filter { inputs[it] == max }
        val ans = maxIndices.find {
            ((it - 1) in inputs.indices && inputs[it - 1] != max) ||
                    ((it + 1) in inputs.indices && inputs[it + 1] != max)
        }

        if (ans == null) bw.write("-1")
        else bw.write("${ans + 1}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
