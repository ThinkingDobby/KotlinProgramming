package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val temp = n % 4
    if (n == 0) bw.write("1")
    else if (temp == 1) bw.write("8")
    else if (temp == 2) bw.write("4")
    else if (temp == 3) bw.write("2")
    else if (temp == 0) bw.write("6")

    bw.flush()
    bw.close()
}
