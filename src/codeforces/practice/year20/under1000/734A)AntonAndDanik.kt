package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine()

    if (inputs.count { it == 'A' } > inputs.count { it == 'D' }) {
        bw.write("Anton")
    } else if (inputs.count { it == 'A' } < inputs.count { it == 'D' }) {
        bw.write("Danik")
    } else {
        bw.write("Friendship")
    }

    bw.flush()
    bw.close()
}