package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map{it.toInt()}.toIntArray()
        val sortedInputs = inputs.sortedArray()

        var sum = 0
        while (true) {
            if (inputs.contentEquals(sortedInputs)) break
            else sum++
            for (i in 0..n - 3 step 2) {
                if (inputs[i] > inputs[i + 1]) {
                    val temp = inputs[i + 1]
                    inputs[i + 1] = inputs[i]
                    inputs[i] = temp
                }
            }

            if (inputs.contentEquals(sortedInputs)) break
            else sum++
            for (i in 1..n - 2 step 2) {
                if (inputs[i] > inputs[i + 1]) {
                    val temp = inputs[i + 1]
                    inputs[i + 1] = inputs[i]
                    inputs[i] = temp
                }
            }
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}