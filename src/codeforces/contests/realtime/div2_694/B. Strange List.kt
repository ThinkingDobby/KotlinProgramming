package codeforces.contests.realtime.div2_694
// TLE
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val x = st.nextToken().toInt()

        val inputs = Vector<Pair<Int, Int>>()
        val st2 = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            inputs.add(st2.nextToken().toInt() to 1)
        }

        var i = 0
        while (true) {
            if (inputs.size == i) break
            if (inputs[i].first % x == 0) {
                inputs.add(inputs[i].first / x to inputs[i].second * x)
            } else break
            i++
        }

        var sum = 0L
        for (j in 0 until inputs.size) {
            sum += inputs[j].first * inputs[j].second
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}