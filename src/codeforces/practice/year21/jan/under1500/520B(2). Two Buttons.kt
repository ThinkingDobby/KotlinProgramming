package codeforces.practice.year21.jan.under1500
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var n1 = n
    var a = 0
    while (n1 < m) {
        n1 *= 2
        a++
    }
    var b = n1 - m
    var c = 0
    for (i in 0 until a) {
        if (b > 1) {
            if (b % 2 == 1) c++
            b /= 2
        }
    }

    bw.write("${a + b + c}")

    bw.flush()
    bw.close()
}