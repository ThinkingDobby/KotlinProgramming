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

    val countForTwo = operationTwo(n) - operationTwo(m) - operationTwo(n - m)
    val countForFive = operationFive(n) - operationFive(m) - operationFive(n - m)

    bw.write("${Math.min(countForTwo, countForFive)}")

    bw.flush()
    bw.close()
}

fun operationTwo(n: Int): Int {
    var tmp = n
    var count = 0
    while (tmp >= 2) {
        count += tmp / 2
        tmp /= 2
    }
    return count
}

fun operationFive(n: Int): Int {
    var tmp = n
    var count = 0
    while (tmp >= 5) {
        count += tmp / 5
        tmp /= 5
    }
    return count
}