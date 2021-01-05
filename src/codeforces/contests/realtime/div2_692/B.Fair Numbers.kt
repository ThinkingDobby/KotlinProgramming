package codeforces.contests.realtime.div2_692

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        var n = br.readLine().toLong()

        while (true) {
            val tmp = n.toString()
            var fair = true
            for (i in tmp) {
                if (i.toInt() - 48 != 0) {
                    if (n % (i.toInt() - 48) != 0L) {
                        fair = false
                        break
                    }
                }
            }

            if (fair) {
                bw.write("$n\n")
                break
            } else {
                n++
            }
        }
    }

    bw.flush()
    bw.close()
}