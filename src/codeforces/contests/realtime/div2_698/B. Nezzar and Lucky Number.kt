package codeforces.contests.realtime.div2_698
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val q = st1.nextToken().toInt()
        val d = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val inputs = Array(q) { st2.nextToken().toInt() }

        val check = Array(10) { (it + 1) * d to ((it + 1) * d) % 10 }
        for (i in inputs) {
            if (i < d * 10) {
                var ans = true
                for (j in 0 until 10) {
                    val tmp = i % 10
                    if (tmp == check[j].second) {
                        if (check[j].first > i) {
                            ans = false
                            break
                        }
                    }
                }
                if (ans) bw.write("YES\n")
                else bw.write("NO\n")
            } else {
                bw.write("YES\n")
            }
        }
    }

    bw.flush()
    bw.close()
}