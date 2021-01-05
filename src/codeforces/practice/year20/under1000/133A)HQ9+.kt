package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val p = br.readLine()
    var working = false

    for (i in p.indices) {
        when (p[i]) {
            'H', 'Q', '9' -> working = true
        }
    }

    if (working) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}