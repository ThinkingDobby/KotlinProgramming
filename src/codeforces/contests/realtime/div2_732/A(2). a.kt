package codeforces.contests.realtime.div2_732

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        val st1 = StringTokenizer(br.readLine())
        val a = Array(n) { st1.nextToken().toInt() }

        val st2 = StringTokenizer(br.readLine())
        val b = Array(n) { st2.nextToken().toInt() }

        var minSum = 0
        var plSum = 0
        for (i in 0 until n) {
            val temp = a[i] - b[i]
            if (temp > 0) plSum += temp
            if (temp < 0) minSum += temp
        }
        if (plSum + minSum != 0) {
            bw.write("-1")
            bw.newLine()
        } else {
            bw.write("$plSum")
            bw.newLine()
            while (true) {
                if (a.contentEquals(b)) break
                for (i in 0 until n - 1) {
                    if (a[i] - b[i] > 0) {
                        a@ for (j in i + 1 until n) {
                            if (a[j] - b[j] < 0) {
                                val temp = Math.min(a[i] - b[i], Math.abs(a[j] - b[j]))
                                for (k in 0 until temp) {
                                    bw.write("${i + 1} ${j + 1} ")
                                    bw.newLine()
                                }
                                a[i] = a[i] - temp
                                a[j] = a[j] + temp
                                break@a
                            }
                        }
                    } else if (a[i] - b[i] < 0) {
                        b@ for (j in i + 1 until n) {
                            if (a[j] - b[j] > 0) {
                                val temp = Math.min(Math.abs(a[i] - b[i]), a[j] - b[j])
                                for (k in 0 until temp) {
                                    bw.write("${j + 1} ${i + 1} ")
                                    bw.newLine()
                                }
                                a[i] = a[i] + temp
                                a[j] = a[j] - temp
                                break@b
                            }
                        }
                    }
                }
            }
        }
    }

    bw.flush()
    bw.close()
}
