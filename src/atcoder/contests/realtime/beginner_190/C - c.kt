package atcoder.contests.realtime.beginner_190
// 미완성
import java.io.*
import java.util.*
import kotlin.collections.HashMap

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val dishes = Array(n + 1){false}
    val check = HashMap<Int, Int>()
    val conditions = mutableListOf<Pair<Int, Int>>()
    repeat(m) {
        val st2 = StringTokenizer(br.readLine())
        val tmp1 = st2.nextToken().toInt()
        val tmp2 = st2.nextToken().toInt()

        conditions.add(tmp1 to tmp2)
        if (tmp1 !in check.keys) check[tmp1] = 0
        else check[tmp1] = check[tmp1]!! + 1
        if (tmp2 !in check.keys) check[tmp2] = 0
        else check[tmp2] = check[tmp2]!! + 1
    }


    val k = br.readLine().toInt()
    repeat(k) {
        val st3 = StringTokenizer(br.readLine())
        val tmp1 = st3.nextToken().toInt()
        val tmp2 = st3.nextToken().toInt()

    }

    var count = 0
    for (i in 0 until m) {
        if (dishes[conditions[i].first] && dishes[conditions[i].second]) count++
    }

    bw.write("$count")

    check.forEach { print("$it ") }
    println()

    dishes.forEach { print("$it ") }
    println()

    bw.flush()
    bw.close()
}