package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        if (n < k) {
            bw.write("NO")
        } else {
            if (n % 2 == 0) {
                if (k <= n / 2) {
                    bw.write("YES")
                    bw.newLine()
                    for (i in 0 until k - 1) {
                        bw.write("2 ")
                    }
                    bw.write("${n - 2 * (k - 1)}")
                } else {
                    if (k % 2 == 0) {
                        bw.write("YES")
                        bw.newLine()
                        for (i in 0 until k - 1) {
                            bw.write("1 ")
                        }
                        bw.write("${n - (k - 1)}")
                    }
                    else bw.write("NO")
                }
            } else {
                if (k % 2 == 1) {
                    bw.write("YES")
                    bw.newLine()
                    for (i in 0 until k - 1) {
                        bw.write("1 ")
                    }
                    bw.write("${n - (k - 1)}")
                }
                else bw.write("NO")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}