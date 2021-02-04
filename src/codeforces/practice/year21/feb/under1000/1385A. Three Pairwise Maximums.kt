package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        val z = st.nextToken().toInt()

        val inputs = arrayOf(x, y, z).sortedArray()
        if (inputs[1] == inputs[2]) {
            bw.write("YES\n")
            bw.write("${inputs[0]} ${inputs[2]} 1\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.flush()
    bw.close()
}