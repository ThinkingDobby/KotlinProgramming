package codeforces.contests.realtime.div3_693

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val numbers = LinkedList<Int>()

        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            numbers.add(st.nextToken().toInt())
        }

        numbers.sortDescending()

        var alice = true
        var aliceSum = 0L
        var bobSum = 0L
        for (i in 0 until n) {
            if (alice) {
                if (numbers.first() % 2 == 0) {
                    aliceSum += numbers.first()
                    numbers.pop()
                } else {
                    numbers.pop()
                }
                alice = false
            } else {
                if (numbers.first() % 2 == 1) {
                    bobSum += numbers.first()
                    numbers.pop()
                } else {
                    numbers.pop()
                }
                alice = true
            }
        }

        if (bobSum > aliceSum) {
            bw.write("Bob")
        } else if (aliceSum > bobSum) {
            bw.write("Alice")
        } else {
            bw.write("Tie")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}