package baekjoon.section15
// 최적화
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    var k = st.nextToken().toInt()

    val inputs = Array(n) { br.readLine().toInt() }

    var count = 0
    for (i in n - 1 downTo 0) {
        if (inputs[i] <= k) {
            count += k / inputs[i]
            k %= inputs[i]
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}