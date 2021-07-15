package codeforces.contests.realtime.div2_732
// WA
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


        val memo = Array(n) { 0 }

        for (i in 0 until n) {
            memo[i] = a[i] - b[i]
        }

        if (memo.sum() != 0) {
            bw.write("-1")
            bw.newLine()
        } else {
            var sum = 0
            for (i in 0 until n) {
                if (memo[i] > 0) sum += memo[i]
            }
            bw.write("$sum")
            bw.newLine()
            for (i in 0 until n - 1) {
                var temp = memo[i]
                if (memo[i] < 0) {
                    for (j in i + 1 until n) {
                        if (memo[j] > 0) {
                            if (Math.abs(temp) > memo[j]) {
                                temp += memo[j]
                                memo[j] = 0
                                for (k in 0 until Math.abs(temp)) {
                                    bw.write("${j + 1} ${i + 1}")
                                    bw.newLine()
                                }
                            } else {
                                for (k in 0 until Math.abs(temp)) {
                                    bw.write("${j + 1} ${i + 1}")
                                    bw.newLine()
                                }
                                memo[j] = memo[j] + temp
                            }
                        }
                    }
                } else if (memo[i] > 0) {
                    for (j in i + 1 until n) {
                        if (memo[j] < 0) {
                            if (temp > Math.abs(memo[j])) {
                                temp += memo[j]
                                memo[j] = 0
                                for (k in 0 until temp) {
                                    bw.write("${i + 1} ${j + 1}")
                                    bw.newLine()
                                }
                            } else {
                                for (k in 0 until temp) {
                                    bw.write("${i + 1} ${j + 1}")
                                    bw.newLine()
                                }
                                memo[j] = memo[j] + temp
                            }
                        }
                    }
                } else continue
            }
        }
    }

    bw.flush()
    bw.close()
}
