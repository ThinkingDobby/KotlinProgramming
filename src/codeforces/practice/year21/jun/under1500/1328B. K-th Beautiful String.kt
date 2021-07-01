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
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt() - 1

        var b1pos = n - 2
        var sum = 0
        for (i in 1 until n) {
            sum += i
            if (sum > k) break
            b1pos--
        }

        val b2pos = b1pos + (sum - k)

        for (i in 0 until n) {
            if (i == b1pos || i == b2pos) bw.write("b")
            else bw.write("a")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}