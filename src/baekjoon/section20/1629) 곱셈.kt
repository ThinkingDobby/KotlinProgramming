package baekjoon.section20
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    var b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    var ans = 1L
    var tmp = (a % c).toLong()

    while (b > 0) {
        if (b % 2 == 1) {
            ans *= tmp
            ans %= c
        }
        tmp = ((tmp % c) * (tmp % c)) % c
        b /= 2
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}