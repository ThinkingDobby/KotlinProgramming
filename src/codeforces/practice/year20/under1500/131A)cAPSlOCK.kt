package codeforces.practice.year20.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val inputs = br.readLine().toMutableList()

    var rule = true
    for (i in 1 until inputs.size) {
        if (inputs[i] != inputs[i].toUpperCase()) {
            rule = false
        }
    }

    if (rule) {
        if (inputs[0] == inputs[0].toUpperCase()) {
            inputs[0] = inputs[0].toLowerCase()
        } else {
            inputs[0] = inputs[0].toUpperCase()
        }

        for (i in 1 until inputs.size) {
            inputs[i] = inputs[i].toLowerCase()
        }
    }

    inputs.forEach { bw.write("$it") }

    bw.flush()
    bw.close()
}