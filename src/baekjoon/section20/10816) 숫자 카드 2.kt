package baekjoon.section20
// Memoization
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = Array(20000001){0}

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        val tmp = st.nextToken().toInt()
        if (tmp >= 0) {
            inputs[tmp]++
        } else {
            inputs[-tmp + 10000000]++
        }
    }

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    for (i in 0 until m) {
        val tmp = st2.nextToken().toInt()
        if (tmp >= 0) {
            bw.write("${inputs[tmp]} ")
        } else {
            bw.write("${inputs[-tmp + 10000000]} ")
        }
    }

    bw.flush()
    bw.close()
}