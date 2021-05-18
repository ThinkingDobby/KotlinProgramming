package baekjoon.section16
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    var k = st.nextToken().toInt()

    val inputs = Array(n) { br.readLine().toInt() }

    var tmp = 0
    for (i in 0 until n) {
        if (inputs[i] > k) {
            break
        }
        tmp = i
    }

    var count = 0
    for (i in tmp downTo 0) {
        if (k / inputs[i] > 0) {
            count += k / inputs[i]
            k %= inputs[i]
            if (k == 0) {
                break
            }
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}