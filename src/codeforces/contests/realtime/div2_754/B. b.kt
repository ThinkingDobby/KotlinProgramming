package codeforces.contests.realtime.div2_754
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()

        var start = false
        var check = false
        var cnt = 0
        var tmp = mutableListOf<Int>()
        var next = 0

        var i = input.length - 1
        var tot = 0
        while (true) {
            if (i < 0) break
            if (!check) {
                if (!start && input[i] == '0') {
                    start = true
                    tmp.add(0, i + 1)
                    cnt = 1
                }
                if (start && input[i] == '0') {
                    cnt++
                    tmp.add(0, i + 1)
                }
                if (start && input[i] == '1') {
                    next = i - 1
                    check = true
                    cnt++
                    tot = cnt
                    tmp.add(0, i + 1)
                    start = false
                }
                i--
            } else {
                if (input[i] == '1') {
                    println(1)
                    tmp.add(0, i + 1)
                    cnt--
                    if (cnt == 0 || i == 0) {
                        bw.write("$tot ")
                        bw.write("${tmp.joinToString(" ")}")
                        bw.newLine()
                        i = next
                        check = false
                    }
                }
                i--
            }
        }
    }


    bw.flush()
    bw.close()
}