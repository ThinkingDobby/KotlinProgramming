package practice.baekjoon.section5
// 최소, 최대
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = Integer.parseInt(br.readLine())
    val arr = ArrayList<Int>(size)

    val st = StringTokenizer(br.readLine())

    for (i in 0 until size) {
        val tmp = st.nextToken().toInt()
        arr.add(tmp)
    }

    bw.write("${arr.min()} ${arr.max()}")
    bw.flush()
    bw.close()
}