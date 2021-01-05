package baekjoon.etc.bronze
// toPlainString()
import java.io.*
import java.math.BigDecimal

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var ans = BigDecimal(1)
    repeat(n) {
        ans *= BigDecimal(0.5)
    }

    bw.write("${ans.toPlainString()}")

    bw.flush()
    bw.close()
}