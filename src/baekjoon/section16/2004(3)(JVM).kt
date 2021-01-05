package baekjoon.section16
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val countTwo = calTwo(n) - calTwo(m) - calTwo(n - m)
    val countFive = calFive(n) - calFive(m) - calFive(n - m)

    bw.write("${Math.min(countTwo, countFive)}")

    bw.flush()
    bw.close()
}

fun calTwo(_n: Int): Int {
    var n = _n
    var count = 0
    while (n >= 2) {
        count += n / 2
        n /= 2
    }
    return count
}

fun calFive(_n: Int): Int {
    var n = _n
    var count = 0
    while (n >= 5) {
        count += n / 5
        n /= 5
    }
    return count
}