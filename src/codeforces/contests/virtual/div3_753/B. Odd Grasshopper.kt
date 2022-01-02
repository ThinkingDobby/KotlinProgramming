package codeforces.contests.virtual.div3_753
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var (x0, n) = br.readLine().split(" ").map { it.toLong() }

        var ans = if (n % 2 == 1L) {
            (n + 1) / 2
        } else {
            -((n + 1) / 2)
        }

        if (x0 % 2 == 0L) ans = -ans

        bw.write("${x0 + ans}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

