package codeforces.contests.realtime.kotlin_heroes_p9
// wa
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val data = br.readLine().split(" ").map { it.toInt() }
    val memo = HashMap<Int, Int>()

    var flag = true
    for (i in data) {
        memo[i] = (memo[i] ?: 0) + 1
        if (memo[i]!! > 2) {
            flag = false
            break
        }
    }

    if (flag) {
        bw.write("YES")
        bw.newLine()
        bw.write("${memo.size}")
        bw.newLine()
        memo.keys.forEach { bw.write("$it ") }
        bw.newLine()
        val tmp = memo.filter { it.value == 2 }.keys.reversed()
        bw.write("${tmp.size}")
        bw.newLine()
        tmp.forEach{bw.write("$it ")}
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}