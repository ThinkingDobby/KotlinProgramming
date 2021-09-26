package codeforces.contests.virtual.div2_edu_106

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        var check = false
        var ans = true
        for (i in 0 until input.length - 1) {
            if (input[i] == input[i + 1]) {
                if (input[i] == '1') check = true
                if (check && input[i] == '0') {
                    ans = false
                    break
                }
            }
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}