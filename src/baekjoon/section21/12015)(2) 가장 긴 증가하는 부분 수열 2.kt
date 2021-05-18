package baekjoon.section21
// practice
import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val sub = ArrayList<Int>()
    sub.add(0)

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        val tmp = st.nextToken().toInt()
        if (tmp > sub.last()) sub.add(tmp)
        else {
            var left = 0
            var right = sub.size - 1

            while (left < right) {
                val mid = (left + right) / 2

                if (sub[mid] < tmp) {
                    left = mid + 1
                } else {
                    right = mid
                }
            }
            sub[right] = tmp
        }
    }

    bw.write("${sub.size - 1}")

    bw.flush()
    bw.close()
}