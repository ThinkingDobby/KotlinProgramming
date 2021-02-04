package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        var n = br.readLine().toInt()

        var count = 0
        while (true) {
            if (n % 6 != 0) break
            n /= 6
            count++
        }

        var count2 = 0
        var count3 = 0
        while (true) {
            if (n % 3 != 0) break
            n /= 3
            count3++
            if (n % 2 == 0) {
                n /= 2
                count2++
            }
        }

        if (n == 1) {
            bw.write("${count + (count3 - count2) * 2}")
        } else {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}