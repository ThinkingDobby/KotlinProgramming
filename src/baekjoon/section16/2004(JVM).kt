package baekjoon.section16
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val countForTwo = twoPowerN(n) - twoPowerN(m) - twoPowerN(n - m)
    val countForFive = fivePowerN(n) - fivePowerN(m) - fivePowerN(n - m)

    bw.write("${Math.min(countForTwo, countForFive)}")

    bw.flush()
    bw.close()
}

fun twoPowerN(_n: Int): Int {
    var n = _n
    var count = 0
    while (n >= 2) {
        count += n / 2
        n /= 2
    }
    return count
}

fun fivePowerN(_n: Int): Int {
    var n = _n
    var count = 0
    while (n >= 5) {
        count += n / 5
        n /= 5
    }
    return count
}