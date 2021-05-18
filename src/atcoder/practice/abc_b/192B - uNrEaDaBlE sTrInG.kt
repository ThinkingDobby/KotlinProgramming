package atcoder.practice.abc_b

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    var ans = true
    for (i in s.indices) {
        if (i % 2 == 0) {
            if (s[i].isUpperCase()) {
                ans = false
                break
            }
        } else {
            if (s[i].isLowerCase()) {
                ans = false
                break
            }
        }
    }

    if (ans) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.flush()
    bw.close()
}