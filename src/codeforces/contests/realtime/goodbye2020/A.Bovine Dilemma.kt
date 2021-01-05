package codeforces.contests.realtime.goodbye2020

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

        val answers = mutableListOf<Int>()
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                if (inputs[j] - inputs[i] !in answers) {
                    answers.add(inputs[j] - inputs[i])
                }
            }
        }

        bw.write("${answers.size}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}