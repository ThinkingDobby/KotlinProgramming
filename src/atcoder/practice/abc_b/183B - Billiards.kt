package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val sx = st.nextToken().toDouble()
    val sy = st.nextToken().toDouble()
    val gx = st.nextToken().toDouble()
    val gy = st.nextToken().toDouble()

    val x = (sy * gx + gy * sx) / (gy + sy)
    bw.write("$x")

    bw.flush()
    bw.close()
}
