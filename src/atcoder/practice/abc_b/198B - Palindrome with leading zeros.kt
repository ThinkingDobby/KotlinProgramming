package atcoder.practice.abc_b

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine()

    var start = 0
    var end = 0
    for (i in n.indices) {
        if (n[i] != '0') {
            start = i
            break
        }
    }
    for (i in n.length - 1 downTo 0) {
        if (n[i] != '0') {
            end = i
            break
        }
    }

    val temp = n.slice(IntRange(start, end))

    var ans = true
    val reversedTemp = temp.reversed()
    for (i in 0 until temp.length / 2) {
        if (temp[i] != reversedTemp[i]) {
            ans = false
            break
        }
    }

    if (ans) bw.write("Yes")
    else bw.write("No")

    bw.flush()
    bw.close()
}