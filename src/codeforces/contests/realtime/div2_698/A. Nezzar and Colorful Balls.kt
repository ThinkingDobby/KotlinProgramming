package codeforces.contests.realtime.div2_698
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }
        var tmp = 1
        val check = Array(n + 1){false}
        for (i in 1 until n) {
            check[tmp] = true
            if (inputs[i] == inputs[i - 1]) tmp++
            else tmp = 1
        }
        check[tmp] = true

        bw.write("${check.count{it}}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
