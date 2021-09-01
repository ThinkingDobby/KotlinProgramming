package codeforces.practice.year21.aug.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toLong() }.sorted()

        val first = LinkedList<Long>()
        val second = LinkedList<Long>()

        for (i in 0 until n / 2) {
            first.add(input[i])
        }
        for (i in n - 1 downTo n / 2) {
            second.add(input[i])
        }

        val ans = LinkedList<Long>()
        while (true) {
            if (second.isNotEmpty()) ans.addFirst(second.poll())
            if (first.isNotEmpty()) ans.addFirst(first.poll())
            if (first.isEmpty() && second.isEmpty()) break
        }

        bw.write("${ans.joinToString(" ")} ")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}

