package practice.baekjoon.etc.gold
// 포기
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var ans = fac(n)

    while (true) {
        if (ans % 10 == 0L) ans /= 10
        else break
    }

    bw.write("${ans % 10}")
    bw.flush()
    bw.close()
}

fun fac(n: Int, a: Long = 1): Long {
    return if (n == 0) a else fac(n - 1, a * n)
}