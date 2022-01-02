package codeforces.contests.virtual.div3_744
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }.toMutableList()

        bw.write("${n - 1}")
        bw.newLine()
        for (i in 0 until n - 1) {
            val target = inputs.indexOf(inputs.subList(i, n).min())
            if (target != i) {
                val tmp = inputs[target]
                for (j in i + 1 until target) {
                    inputs[j] = inputs[j - 1]
                }
                inputs[i] = tmp
                bw.write("${i + 1} ${target + 1} ${target - i}")
                bw.newLine()
            }
        }
    }

    bw.flush()
    bw.close()
}