package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val t = st.nextToken().toInt()

    val tmpInput = br.readLine()
    val input = CharArray(n) { '0' }
    for (i in 0 until n) {
        input[i] = tmpInput[i]
    }

    var count = 0
    while (true) {
        if (count == t) {
            break
        }
        for (i in 1 until n) {
            if (input[i] == 'G' && input[i - 1] == 'B') {
                input[i] = 'b'
                input[i - 1] = 'g'
            }
        }
        for (i in 0 until n) {
            input[i] = input[i].toUpperCase()
        }
        count++
    }

    input.forEach { bw.write("$it") }

    bw.flush()
    bw.close()
}