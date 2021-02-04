package atcoder.practice.abc_c
// 기울기가 같아도 여러 직선 생길 수 있음
// WA
import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val points = mutableListOf<Pair<Double, Double>>()
    val gradients = mutableListOf<Double>()
    val gradientsPlus = mutableListOf<Double>()

    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toDouble()
        val y = st.nextToken().toDouble()

        for (j in 0 until points.size) {
            val tmp: Double = (y - points[j].second) / (x - points[j].first)
            print("$i $j ")
            println("$tmp ${y - x * tmp}")

            for (k in 0 until gradients.size) {
                if (tmp == gradients[k]) {
                    if (y - x * tmp == gradientsPlus[k]) {
                        println("Yes")
                        exitProcess(0)
                    }
                    gradients.add(tmp)
                    gradientsPlus.add(y - tmp * x)
                }
            }
        }
        points.add(x to y)
    }

    gradients.forEach { print("$it ") }
    println()
    gradientsPlus.forEach { print("$it ") }
    println()
    println("No")
}