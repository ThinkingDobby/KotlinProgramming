package codeforces.contests.realtime.goodbye2020
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine()

        var count = 0
        var i = 0

        if (input.length == 2) {
            if (input[0] == input[1]) count = 1
        } else if (input.length != 1) {

            while (true) {
                if (input[i] == input[i + 1] && input[i] == input[i + 2]) count += 2
                else if (input[i] == input[i + 1]) count++
                else if (input[i + 1] == input[i + 2]) count++
                else if (input[i] == input[i + 2]) count++

                i += 3
                if (i >= (input.length / 3) * 3) break
            }

            if (input.length % 3 == 2) {
                if (input[input.length - 1] == input[input.length - 2]) count++
            }

        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}