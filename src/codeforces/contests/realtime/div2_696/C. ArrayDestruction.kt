package codeforces.contests.realtime.div2_696
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val inputs = mutableListOf<Int>()

        var ans = true

        val st = StringTokenizer(br.readLine())
        for (i in 0 until 2 * n) {
            inputs.add(st.nextToken().toInt())
        }

        inputs.sort()

        for (i in 2 * n - 1 downTo 2) {
            if (inputs[i] == 0) continue
            for (j in i - 1 downTo 1) {
                if (inputs[j] == 0) continue
                if ((inputs[i] - inputs[j]) in inputs) {
                    inputs[inputs.indexOf(inputs[i] - inputs[j])] = 0
                    break
                }
            }
            println(inputs)
            ans = false
            break
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}