package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine().toLong()
        if (input % 2050 != 0L) bw.write("-1")
        else {
            val temp = (input / 2050).toString()
            val sum = temp.sumBy {it - '0'}
            bw.write("$sum")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
