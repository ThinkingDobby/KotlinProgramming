package programmers.practice.dfs_bfs

import java.io.*
import java.util.*

class Solution {
    lateinit var visited: BooleanArray
    lateinit var computers: Array<IntArray>
    var count = 0

    fun solution(n: Int, _computers: Array<IntArray>): Int {
        visited = BooleanArray(n){false}
        computers = _computers

        for (i in 0 until n) {
            if (!visited[i]) count++
            dfs(i, n)
        }

        return count
    }

    fun dfs(now: Int, n: Int) {
        if (!visited[now]) {
            visited[now] = true
            for (to in 0 until n) {
                if (computers[now][to] == 1) {
                    dfs(to, n)
                }
            }
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val ans = Solution()
    val n = br.readLine().toInt()
    val input = Array(n){ IntArray(n) }
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            input[i][j] = st.nextToken().toInt()
        }
    }

    bw.write("${ans.solution(n, input)}")

    bw.flush()
    bw.close()
}