package baekjoon.section19

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val an = st1.nextToken().toInt()
    val am = st1.nextToken().toInt()

    val a = Array(an){IntArray(am)}
    for (i in 0 until an) {
        val st2 = StringTokenizer(br.readLine())
        for (j in 0 until am) {
            a[i][j] = st2.nextToken().toInt()
        }
    }

    val st3 = StringTokenizer(br.readLine())
    val bn = st3.nextToken().toInt()
    val bm = st3.nextToken().toInt()

    val b = Array(bn){IntArray(bm)}
    for (i in 0 until bn) {
        val st4 = StringTokenizer(br.readLine())
        for (j in 0 until bm) {
            b[i][j] = st4.nextToken().toInt()
        }
    }

    for (j in 0 until an) {
        for (tmp in 0 until bm) {
            var sum = 0
            for (i in 0 until am) {
                sum += a[j][i] * b[i][tmp]
            }
            bw.write("$sum ")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}