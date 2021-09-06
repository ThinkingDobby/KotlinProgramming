package codeforces.contests.realtime.div2_742
// 참조한 코드
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val a = ("0" + input.filterIndexed { idx, _ -> idx % 2 == 0 }).toInt()
        val b = ("0" + input.filterIndexed { idx, _ -> idx % 2 == 1 }).toInt()

        bw.write("${(a + 1) * (b + 1) - 2}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
