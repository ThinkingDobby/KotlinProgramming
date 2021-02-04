package codeforces.practice.year21.jan.under1500
// 미완성: Stack Overflow
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val ans = Array(30010){Int.MAX_VALUE}

    fun dfs(num: Int, count: Int = 0) {
        if (num <= 0 || num >= m * 2) return

        if (ans[num] <= count) return
        ans[num] = count

        dfs(num * 2, count + 1)
        dfs(num - 1, count + 1)
    }

    if (m - n <= 0) {
        bw.write("${n - m}")
    } else {
        dfs(n)
        bw.write("${ans[m]}")
    }

    bw.flush()
    bw.close()
}