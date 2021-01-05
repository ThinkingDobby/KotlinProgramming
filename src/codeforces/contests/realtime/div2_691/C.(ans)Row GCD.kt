package codeforces.contests.realtime.div2_691
// 참조한 코드
// conceptForC 참고할 것
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val aArray = Array(n) { st2.nextToken().toLong() }

    val st3 = StringTokenizer(br.readLine())
    val bArray = Array(m) { st3.nextToken().toLong() }

    var tmp = 0L
    for (i in 1 until n) {
        tmp = gcd(Math.abs(aArray[i] - aArray[0]), tmp)
    }

    for (i in 0 until m) {
        bw.write("${gcd(aArray[0] + bArray[i], tmp)} ")
    }

    bw.flush()
    bw.close()
}

private fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}