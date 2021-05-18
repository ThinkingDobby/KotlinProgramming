package atcoder.practice.abc_b
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val w = st.nextToken().toInt() * 1000

    val upper = w / a
    val lower = (w + b - 1) / b
    if (lower > upper) {
        bw.write("UNSATISFIABLE")
    } else {
        bw.write("$lower $upper")
    }

    bw.flush()
    bw.close()
}