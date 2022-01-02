package codeforces.contests.virtual.div3_744

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val ac = input.count { it == 'A' }
        val bc = input.count { it == 'B' }
        val cc = input.count { it == 'C' }

        if (bc == ac + cc) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
