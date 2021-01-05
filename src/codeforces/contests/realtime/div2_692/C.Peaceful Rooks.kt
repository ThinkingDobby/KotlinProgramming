package codeforces.contests.realtime.div2_692
// Wrong Answer
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val xUsed = Array(n) { false }
        val yUsed = Array(n) { false }
        val yLoc = Array(n){0}
        val isEstablished = Array(n){false}

        repeat(m) {
            val st2 = StringTokenizer(br.readLine())
            val tmpX = st2.nextToken().toInt() - 1
            val tmpY = st2.nextToken().toInt() - 1
            xUsed[tmpX] = true
            yUsed[tmpY] = true
            yLoc[tmpX] = tmpY
            if (tmpX == tmpY) isEstablished[tmpX] = true
        }

        var count = 0
        for (i in 0 until n) {
            if (!isEstablished[i]) {
                if (xUsed[i]) {
                    count++
                    if (yUsed[i]) {
                        count++
                    }
                    yUsed[yLoc[i]] = false
                }
            }
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}