package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val numberOfStudents = Array(n) { st.nextToken().toInt() }
    val memo = Array(5) { 0 }

    for (i in numberOfStudents.indices) {
        when (numberOfStudents[i]) {
            1 -> memo[1]++
            2 -> memo[2]++
            3 -> memo[3]++
            4 -> memo[4]++
        }
    }

    var count = memo[4] + memo[3] + memo[2] / 2
    memo[1] -= memo[3]

    if (memo[2] % 2 == 1) {
        count += 1
        memo[1] -= 2
    }

    if (memo[1] > 0) {
        count += (memo[1] + 3) / 4
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}