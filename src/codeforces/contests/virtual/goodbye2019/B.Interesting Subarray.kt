package codeforces.contests.virtual.goodbye2019
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

        var max = 0
        var min = 1_000_000_000
        var count = 0
        for (i in inputs.indices) {
        }
    }
}