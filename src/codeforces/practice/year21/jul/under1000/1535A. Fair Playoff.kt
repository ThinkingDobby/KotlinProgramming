package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val inputs = Array(4) { st.nextToken().toInt() }

        val max = inputs.max()!!
        val maxIdx = inputs.indexOf(max)

        var secondMax = -1
        var secondMaxIdx = -1
        for (i in 0 until 4) {
            if (i == maxIdx) continue
            if (secondMax < inputs[i]) {
                secondMax = inputs[i]
                secondMaxIdx = i
            }
        }

        if (maxIdx == 0 && secondMaxIdx == 1 || maxIdx == 1 && secondMaxIdx == 0 ||
                maxIdx == 2 && secondMaxIdx == 3 || maxIdx == 3 && secondMaxIdx == 2) {
            bw.write("NO")
        } else {
            bw.write("YES")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}