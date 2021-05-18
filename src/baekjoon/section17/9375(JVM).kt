package baekjoon.section17

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()

        val nameOfType = mutableListOf<String>()
        val numberOfEach = mutableListOf<Int>()

        repeat(n) {
            val st = StringTokenizer(br.readLine())

            val cloth = st.nextToken()
            val type = st.nextToken()
            if (type !in nameOfType) {
                nameOfType.add(type)
                numberOfEach.add(1)
            } else {
                numberOfEach[nameOfType.indexOf(type)]++
            }
        }
        var ans = 1
        for (i in numberOfEach.indices) {
            ans *= numberOfEach[i] + 1
        }
        bw.write("${ans - 1}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}