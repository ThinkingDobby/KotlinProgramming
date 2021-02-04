package codeforces.contests.realtime.div2_edu_102
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        val ans = Array(k) { it + 1 }

        val unUsed = k - (n - k + 1)
        val newAns = ans.slice(0 until unUsed) + ans.slice(unUsed until k).reversed()
        newAns.forEach { bw.write("$it ") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}