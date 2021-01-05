package practice.baekjoon.section11

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val arr = Array(n){0}

    val st2 = StringTokenizer(br.readLine())
    repeat(n) {
        val tmp = st2.nextToken().toInt()
        arr[it] = tmp
    }


    var max = 0
    for (i in 0 until n - 2)
        for (j in i + 1 until n - 1)
            for (k in j + 1 until n)
                if (arr[i] + arr[j] + arr[k] in (max + 1)..m) max = arr[i] + arr[j] + arr[k]

    bw.write("$max")

    bw.flush()
    bw.close()
}