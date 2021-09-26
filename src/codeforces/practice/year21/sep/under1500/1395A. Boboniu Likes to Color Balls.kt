package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ").map { it.toInt() }
        val cnt = input.count { it % 2 == 0 }
        if (input.subList(0, 3).min() == 0) {
            if (cnt in (3..4)) bw.write("Yes")
            else bw.write("No")
        } else {
            if (cnt != 2) bw.write("Yes")
            else bw.write("No")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
