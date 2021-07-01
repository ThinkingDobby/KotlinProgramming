package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val x = st1.nextToken().toInt() * 100   // 부동소수점 관련 - 정수 범위에서 연산하는 것이 안전

    var total = 0L
    var now = -1
    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        val v = st2.nextToken().toInt()
        val p = st2.nextToken().toInt()

        total += v * p

        if (total > x) {
            now = i + 1
            break
        }

    }

    bw.write("$now")

    bw.flush()
    bw.close()
}