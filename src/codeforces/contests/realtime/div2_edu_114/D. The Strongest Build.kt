package codeforces.contests.realtime.div2_edu_114
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val c = mutableListOf<MutableList<Int>>()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val ct = st.nextToken().toInt()
        val tmp = mutableListOf<Int>()
        for (i in 0 until ct) {
            tmp.add(st.nextToken().toInt())
        }
        c.add(tmp)
    }

    val m = br.readLine().toInt()
    val memo = Array(n) { Array(m) { true } }
    repeat(m) {
        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            memo[i][st.nextToken().toInt() - 1] = false
        }
    }

    for (i in 0 until n) {
        bw.write("${c[i][memo[i].indexOfLast { it }]} ")
    }

    bw.flush()
    bw.close()
}



