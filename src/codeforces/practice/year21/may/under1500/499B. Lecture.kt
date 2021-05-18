package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val m = st1.nextToken().toInt()
    val n = st1.nextToken().toInt()

    val wordsFirst = Array(n) { " " }
    val wordsSecond = Array(n) { " " }
    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        val first = st2.nextToken()
        val second = st2.nextToken()
        wordsFirst[i] = first
        wordsSecond[i] = second
    }

    val st3 = StringTokenizer(br.readLine())
    val lectureWords = Array(m) { st3.nextToken() }
    for (j in lectureWords) {
        for (i in 0 until n) {
            if (j == wordsFirst[i] || j == wordsSecond[i]) {
                if (wordsFirst[i].length > wordsSecond[i].length) {
                    bw.write("${wordsSecond[i]} ")
                } else {
                    bw.write("${wordsFirst[i]} ")
                }
            }
        }
    }

    bw.flush()
    bw.close()
}
