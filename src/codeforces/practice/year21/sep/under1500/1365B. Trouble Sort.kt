package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }
        val types = br.readLine().split(" ").map { it.toInt() }

        val isSorted = (1 until n).all { inputs[it - 1] <= inputs[it] }
        val typeCheck = types.any { it == 0 } && types.any { it == 1 }

        if (isSorted) bw.write("Yes")
        else {
            if (typeCheck) bw.write("Yes")
            else bw.write("No")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
