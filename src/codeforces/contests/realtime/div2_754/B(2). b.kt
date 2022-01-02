package codeforces.contests.realtime.div2_754
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()

        var cnt = 0
        var j = 0
        var start = false
        var tmp = 0

        var ans = ""
        var total = 0
        var cnttmp = 0
        for (i in input.length - 1 downTo 0) {
            if (!start && input[i] == '0') {
                tmp = i
                start = true
                cnt++
            }
            else if (start && input[i] == '0') cnt++
            if (start && input[i] == '1') {
                if (cnt != 0) {
                    while (j < i) {
                        if (cnt == 0) break
                        if (input[j] == '1') {
                            ans += "${j + 1} "
                            cnt--

                        }
                        j++
                    }
                    for (k in i..tmp) {
                        ans += "${k + 1} "
                    }
                    ans += "\n"
                    total++
                    cnt = 0
                    start = false
                    if (j >= i) break
                }
            }
        }

        if (total == 0) {
            bw.write("0")
            bw.newLine()
        } else {
            bw.write("$total")
            bw.newLine()
            bw.write("${(ans.trim().length + 1) / 2} ")
            bw.write("$ans")
        }
    }

    bw.flush()
    bw.close()
}