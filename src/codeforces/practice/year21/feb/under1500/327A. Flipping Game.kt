package codeforces.practice.year21.feb.under1500
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n + 1) { 0 }
    for (i in 1..n) {
        inputs[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 1){0}
    for (i in 1..n) {
        val tmp = if (inputs[i] == 0) 1 else -1
        dp[i] = Math.max(dp[i - 1] + tmp, tmp)
    }

    var sum = 0
    val max = dp.max()!!
    val maxIndex = dp.indexOf(max)
    for (i in 1..maxIndex - max + 1) {
        sum += inputs[i]
    }
    for (i in maxIndex - max + 1 until maxIndex + 1) {
        sum += if (inputs[i] == 1) 0 else 1
    }
    for (i in maxIndex + 1..n) {
        sum += inputs[i]
    }

    bw.write("$sum")
    println(maxIndex)
    dp.forEachIndexed { idx, value -> println("$idx $value ${inputs[idx]}") }

    bw.flush()
    bw.close()
}

