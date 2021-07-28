package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        if (n <= 30) bw.write("NO")
        else {
            val temp = n - 30
            bw.write("YES")
            bw.newLine()
            if (temp == 6 || temp == 10 || temp == 14) {
                bw.write("${temp - 1} 6 10 15")
            } else {
                bw.write("$temp 6 10 14")
            }
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
