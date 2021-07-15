package codeforces.contests.realtime.div2_732
// TLE
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }

        val memo = Array(10001) { 0 }
        for (i in n - 1 downTo 1) {
            for (j in 0 until i) {
                if (inputs[j] > inputs[j + 1]) {
                    val temp = inputs[j]
                    inputs[j] = inputs[j + 1]
                    inputs[j + 1] = temp
                    memo[inputs[j]]++
                    memo[inputs[j + 1]]++
                }
            }
        }

        if (memo.count {it % 2 != 0} != 0) {
            bw.write("NO")
        } else {
            bw.write("YES")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}