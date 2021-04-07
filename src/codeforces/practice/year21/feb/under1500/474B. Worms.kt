package codeforces.practice.year21.feb.under1500
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())
    val piles = Array(n) { st1.nextToken().toInt() }

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    val juicyWormLocations = Array(m) { st2.nextToken().toInt() }
    val sortedJuicyWormLocations = juicyWormLocations.sortedArray()

    val ans = Array(m){0}

    var count = 0
    var now = 0
    a@for (i in 0 until n) {
        count += piles[i]
        while (true) {
            if (count >= sortedJuicyWormLocations[now]) {
                ans[juicyWormLocations.indexOf(sortedJuicyWormLocations[now])] = i + 1
                now++
                if (now == m) break@a
            } else break
        }
    }

    ans.forEach { bw.write("$it\n") }

    bw.flush()
    bw.close()
}