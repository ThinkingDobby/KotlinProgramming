package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    var count = 0
    for (i in input.indices) {
        if (input[i] == '4' || input[i] == '7') {
            count++
        }
    }

    val tmp = count.toString()
    var ans = "YES"
    for (i in tmp.indices) {
        if (tmp[i] != '4' && tmp[i] != '7') {
            ans = "NO"
            break
        }
    }

    bw.write(ans)

    bw.flush()
    bw.close()
}