package baekjoon.section14
// practice: 직접 작성, 최적화 x
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = Array(n) { st.nextToken().toInt() }

    var max = 0
    var now: Int
    for (i in 0 until n) {
        var count = 1
        now = arr[i]
        for (j in i until n) {
            if (now < arr[j]) {
                count++
                now = arr[j]
            }
        }
        if (count > max) max = count
    }

    bw.write("$max")

    bw.flush()
    bw.close()
}
