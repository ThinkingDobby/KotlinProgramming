package codeforces.contests.realtime.div2_742


import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        var tmp = 0
        if (a % 2 == 0) {
            if ((a / 2) % 2 == 0) tmp = 0
            else tmp = 1
        } else {
            if ((a - 1) % 4 == 0) tmp = a - 1
            else tmp = a
        }

        if (tmp == b) bw.write("$a")
        else if (tmp.xor(b) == a) bw.write("${a + 2}")
        else bw.write("${a + 1}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}