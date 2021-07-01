package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val memo = Array(51) { 1 }

    for (i in 2 until 51) {
        for (j in 2 until i) {
            if (i != j && i % j == 0) {
                memo[i] = 0
                break
            }
        }
    }

    val primeNumbers = LinkedList<Int>()
    for (i in 2 until memo.size) {
        if (memo[i] == 1) primeNumbers.add(i)
    }

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    if (primeNumbers.indexOf(m) == primeNumbers.indexOf(n) + 1) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}