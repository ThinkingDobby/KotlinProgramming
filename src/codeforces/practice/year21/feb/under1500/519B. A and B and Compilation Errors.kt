package codeforces.practice.year21.feb.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st1 = StringTokenizer(br.readLine())
    val initialErrors = Array(n) { st1.nextToken().toInt() }.sortedArray()

    val st2 = StringTokenizer(br.readLine())
    val firstCheckedErrors = Array(n - 1) { st2.nextToken().toInt() }.sortedArray()

    var firstAnswer = 0
    for (i in 0 until n - 1) {
        if (initialErrors[i] != firstCheckedErrors[i]) {
            firstAnswer = initialErrors[i]
            break
        }
    }
    if (firstAnswer == 0) firstAnswer = initialErrors[n - 1]


    val st3 = StringTokenizer(br.readLine())
    val secondCheckedErrors = Array(n - 2) { st3.nextToken().toInt() }.sortedArray()

    var secondAnswer = 0
    for (i in 0 until n - 2) {
        if (firstCheckedErrors[i] != secondCheckedErrors[i]) {
            secondAnswer = firstCheckedErrors[i]
            break
        }
    }
    if (secondAnswer == 0) secondAnswer = firstCheckedErrors[n - 2]

    bw.write("$firstAnswer")
    bw.newLine()
    bw.write("$secondAnswer")

    bw.flush()
    bw.close()
}