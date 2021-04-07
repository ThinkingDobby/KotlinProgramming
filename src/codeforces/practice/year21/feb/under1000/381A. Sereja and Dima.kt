package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val cards = LinkedList<Int>()
    for (i in 0 until n) {
        cards.add(st.nextToken().toInt())
    }

    var first = true
    var firstCount = 0
    var secondCount = 0

    for (i in 0 until n) {
        var tmp = 0
        if (cards.first() > cards.last()) {
            tmp = cards.first()
            cards.pollFirst()
        } else {
            tmp = cards.last()
            cards.pollLast()
        }

        if (first) {
            firstCount += tmp
            first = false
        } else {
            secondCount += tmp
            first = true
        }
    }

    bw.write("$firstCount $secondCount")

    bw.flush()
    bw.close()
}