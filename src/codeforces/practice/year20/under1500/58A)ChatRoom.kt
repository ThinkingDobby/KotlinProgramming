package codeforces.practice.year20.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val ans = "hello"

    var cnt = 0
    for (i in s.indices) {
        if (s[i] == ans[cnt]) {
            cnt++
        }
        if (cnt == 5) {
            break
        }
    }

    if (cnt == 5) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}