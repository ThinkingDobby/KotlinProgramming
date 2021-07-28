package codeforces.practice.year21.jul.under1500
// 참조한 코드
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map{it.toLong()}
        if (m == 1L) bw.write("NO")
        else {
            bw.write("YES")
            bw.newLine()
            bw.write("$n ${n * m} ${n * (m + 1)}")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}