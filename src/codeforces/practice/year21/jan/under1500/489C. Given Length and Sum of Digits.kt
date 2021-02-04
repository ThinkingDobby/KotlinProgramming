package codeforces.practice.year21.jan.under1500
// WA
import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val m = st.nextToken().toInt()
    var s = st.nextToken().toInt()

    val ans = mutableListOf<Int>()

    while (true) {
        s -= 9
        if (s <= 0) {
            ans.add(9 + s)
            break
        } else {
            ans.add(9)
        }
    }

    if (ans.size == m) {
        for (i in m - 1 downTo 0) {
            bw.write("${ans[i]}")
        }
        bw.write(" ")
        for (i in 0 until m) {
            bw.write("${ans[i]}")
        }
    } else if (ans.size < m) {
        if (ans.sum() < m) {
            print("-1 -1")
            return
        }
        var tmp = m - ans.size
        var count = 0
        for (i in ans.size - 1 downTo 1) {
            if (ans[i] - tmp > 1) {
                ans[i] = ans[i] - tmp
                count += tmp
                break
            } else {
                count += ans[i] - 1
                tmp -= ans[i] - 1
                ans[i] = 1
            }
        }

        val sb = StringBuilder()
        for (i in 0 until ans.size) {
            sb.append("${ans[i]}")
        }
        repeat(count) {
            sb.append("1")
        }

        bw.write("${sb.reversed()} $sb")
    } else if (ans.size > m) {
        bw.write("-1 -1")
    }

    bw.flush()
    bw.close()
}