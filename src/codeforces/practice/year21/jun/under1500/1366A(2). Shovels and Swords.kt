package codeforces.practice.year21.jun.under1500
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        var a = st.nextToken().toLong()
        var b = st.nextToken().toLong()

        val ans = Math.min((a + b) / 3, Math.min(a, b))

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
