package codeforces.contests.virtual.div2_729
// MLE
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        var ans = false
        if ((n - 1) % b == 0) {
            ans = true
        } else if (a != 1) {
            var now = 1L
            while (now <= n) {
                if ((n - now) % b == 0L) {
                    ans = true
                    break
                }
                now *= a
            }
        }

        if (ans) bw.write("Yes")
        else bw.write("No")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}