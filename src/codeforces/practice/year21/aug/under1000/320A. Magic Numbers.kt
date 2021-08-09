package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val len = input.length
    var i = 2
    var ans = true

    if (input[0] != '1') ans = false
    else if (len > 1) if (input[1] != '1' && input[1] != '4') ans = false
    else {
        while (i < len) {
            if (input[i] != '1' && input[i] != '4') {
                ans = false
                break
            }

            if (input[i] == '4') {
                if (input[i - 1] == '4') {
                    if (input[i - 2] == '4') {
                        ans = false
                        break
                    }
                }
            }

            i++
        }
    }

    if (ans) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}