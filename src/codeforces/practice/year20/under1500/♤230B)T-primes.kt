package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = Array(n){st.nextToken().toLong()}

    val tmp = 1000000
    val checkPrimeNumbers = Array(tmp + 1){1}
    checkPrimeNumbers[1] = 0
    for (i in 2..tmp) {
        for (j in 2..tmp) {
            if (i * j > tmp) break
            else checkPrimeNumbers[i * j] = 0
        }
    }

    inputs.forEach {
        var ans = false
        if (Math.sqrt(it.toDouble()) == Math.sqrt(it.toDouble()).toInt().toDouble()) {
            if (checkPrimeNumbers[Math.sqrt(it.toDouble()).toInt()] == 1) ans = true
        }
        if (ans) bw.write("YES\n")
        else bw.write("NO\n")
    }

    bw.flush()
    bw.close()
}