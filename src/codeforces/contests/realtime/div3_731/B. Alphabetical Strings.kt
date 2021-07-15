package codeforces.contests.realtime.div3_731

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine()

        var left = input.indexOf('a')
        var right = input.indexOf('a')

        var ans = true
        var now = 'b'

        if (left == -1) ans = false
        else {
            while (true) {
                if (left == 0) break
                if (right == input.length - 1) break
                if (input[left - 1] == now) {
                    left--
                    now++
                } else if (input[right + 1] == now) {
                    right++
                    now++
                } else {
                    ans = false
                    break
                }
            }

            if (ans) {
                if (left == 0) {
                    for (i in right until input.length - 1) {
                        if (input[i + 1] != now) {
                            ans = false
                            break
                        } else now++
                    }
                } else if (right == input.length - 1) {
                    for (i in left downTo 1) {
                        if (input[i - 1] != now) {
                            ans = false
                            break
                        } else now++
                    }
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