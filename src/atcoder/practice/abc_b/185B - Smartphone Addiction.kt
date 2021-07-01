package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val firstN = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val t = st.nextToken().toInt()

    var n = firstN
    var ans = true
    var prev = 0

    var cafeTime = LinkedList<Pair<Int, Int>>()
    for (i in 0 until m) {
        val st2 = StringTokenizer(br.readLine())
        cafeTime.add(st2.nextToken().toInt() to st2.nextToken().toInt())
    }

    for (i in 0 until m) {
        n -= cafeTime[i].first - prev
        if (n <= 0) {
            ans = false
            break
        }
        n += cafeTime[i].second - cafeTime[i].first
        if (n > firstN) n = firstN
        prev = cafeTime[i].second
    }

    n -= t - prev
    if (n <= 0) ans = false

    if (ans) bw.write("Yes")
    else bw.write("No")

    bw.flush()
    bw.close()
}