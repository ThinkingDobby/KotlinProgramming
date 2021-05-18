package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val h = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()

    val inputs = Array(h) { br.readLine() }

    var count = 0

    for (i in x - 1 downTo 0) {
        if (inputs[i][y - 1] == '#') break
        else count++
    }
    for (i in x - 1 until h) {
        if (inputs[i][y - 1] == '#') break
        else count++
    }

    for (i in y - 1 downTo 0) {
        if (inputs[x - 1][i] == '#') break
        else count++
    }
    for (i in y - 1 until w) {
        if (inputs[x - 1][i] == '#') break
        else count++
    }

    bw.write("${count - 3}")

    bw.flush()
    bw.close()
}