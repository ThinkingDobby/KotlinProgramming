package codeforces.contests.virtual.div3_677

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    val numbers = mutableListOf<Int>()
    for (i in 1..9) {
        val sb = StringBuilder()
        for (j in 1..4) {
            sb.append(i)
            numbers.add(sb.toString().toInt())
        }
    }

    repeat(t) {
        val x = br.readLine().toInt()
        var count = 0
        var sum = 0
        for (i in numbers) {
            count++
            sum += count
            if (count > 3) count = 0
            if (i == x) break
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}