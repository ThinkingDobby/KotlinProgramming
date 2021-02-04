package atcoder.practice.abc_c
// WA
import java.io.*
import java.util.*
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val points = mutableListOf<Pair<Int, Int>>()

    val n = br.readLine().toInt()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        points.add(st.nextToken().toInt() to st.nextToken().toInt())
    }

    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j + 1 until n) {
                val arr = arrayOf(distance(points[i].first, points[i].second, points[j].first, points[j].second),
                        distance(points[j].first, points[j].second, points[k].first, points[k].second),
                        distance(points[i].first, points[i].second, points[k].first, points[k].second)
                ).sorted()

                if (arr.last() >= arr[0] + arr[1]) {
                    println("Yes")
                    exitProcess(0)
                }
            }
        }
    }

    println("No")
}

private fun distance(firstX: Int, firstY: Int, secondX: Int, secondY: Int): Double {
    return sqrt((firstX - secondX) * (firstX - secondX) + (firstY - secondY) * (firstY - secondY).toDouble())
}