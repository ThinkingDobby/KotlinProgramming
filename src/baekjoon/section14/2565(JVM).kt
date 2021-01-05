package baekjoon.section14
// 참조한 코드
import java.io.*
import java.util.*

data class Wire(val a_value: Int, val b_value: Int)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val lines = readLine().toInt()
    val wires = mutableListOf<Wire>()
    val dp = IntArray(lines + 1){0}

    wires.add(0, Wire(0, 0))

    for (i in 1..lines) {
        val st = StringTokenizer(readLine())
        val a_value = st.nextToken().toInt()
        val b_value = st.nextToken().toInt()
        wires.add(i, Wire(a_value, b_value))
    }

    wires.sortBy { it.a_value }

    for (i in 1..lines) {
        var max = 0
        for(j in 0..i) {
            if (wires[i].a_value > wires[j].a_value) {
                if (wires[i].b_value > wires[j].b_value) {
                    if (dp[j] > max) max = dp[j]
                }
            }
        }
        dp[i] = max + 1
    }

    print(lines - dp.max()!!)
    close()
}