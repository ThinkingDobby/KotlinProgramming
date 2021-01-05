package atcoder.contests.virtual.beginner_185

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a1 = st.nextToken().toInt()
    val a2 = st.nextToken().toInt()
    val a3 = st.nextToken().toInt()
    val a4 = st.nextToken().toInt()

    bw.write("${Math.min(a1, Math.min(a2, Math.min(a3, a4)))}")

    bw.flush()
    bw.close()
}