package practice.baekjoon.section4
//EOF in Kotlin with BufferedReader
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val st = StringTokenizer(br.readLine() ?: break)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("${a + b}\n")
        bw.flush()
    }

    bw.close()
}