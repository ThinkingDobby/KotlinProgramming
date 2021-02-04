package atcoder.contests.realtime.beginner_189

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    if (input[0] == input[1] && input[1] == input[2]) {
        bw.write("Won")
    } else {
        bw.write("Lost")
    }

    bw.flush()
    bw.close()
}