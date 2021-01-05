package practice.baekjoon.section7

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val a = st.nextToken()
    val b = st.nextToken()

    val a2 = Array(3) {"0"}
    val b2 = Array(3) {"0"}

    for (i in 0..2) {
        a2[i] = a[2 - i].toString()
        b2[i] = b[2 - i].toString()
    }

    val a3 = Integer.parseInt(a2[0]+a2[1]+a2[2])
    val b3 = Integer.parseInt(b2[0]+b2[1]+b2[2])

    if (a3 > b3) bw.write("$a3")
    else bw.write("$b3")

    bw.flush()
    bw.close()
}