package atcoder.practice.abc_c
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val k = st1.nextToken().toLong()

    val costs = Array(n) { LongArray(n) }
    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            costs[i][j] = st2.nextToken().toLong()
        }
    }

    fun dfs(city: Int = 0, visited: List<Int> = listOf(0), cost: Long = 0L): Int {
        if (visited.size == n) {
            return if (cost + costs[city][0] == k) 1 else 0
        }
        var res = 0
        for (i in 0 until n) {
            if (i in visited) continue
            res += dfs(i, visited + i, cost + costs[city][i])
        }
        return res
    }

    bw.write("${dfs()}")

    bw.flush()
    bw.close()
}