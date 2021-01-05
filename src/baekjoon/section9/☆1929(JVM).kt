package baekjoon.section9
// 에라토스테네스의 체
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val m = st.nextToken().toInt()
    val n = st.nextToken().toInt()
    val arr = Array(n + 1){0}
    arr[1] = 1

    for (i in 2..n)
        for (j in 2..n)
            if (i * j <= n) arr[i * j] = 1 else break

    for (i in m..n) if (arr[i] != 1) bw.write("$i\n")

    bw.flush()
    bw.close()
}