package codeforces.contests.realtime.goodbye2020
// Wrong Answer
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine()

        var count = 0
        var i = 0

        while (true) {
            if (i > input.length - 4) break
            if (input[i] == input[i + 1] && input[i] == input[i + 2] && input[i] == input[i + 3]) {
                count += 2
                i += 4
            } else if (input[i] == input[i + 1] && input[i] == input[i + 2]) {
                count += 2
                i += 3
            } else if (input[i] != input[i + 1] && input[i] == input[i + 2]) {
                count += 1
                i += 3
            } else if (input[i] == input[i + 1]) {
                count += 1
                i += 2
            } else {
                i++
            }
        }

        if (i == input.length - 3) {
            if (input[i] == input[i + 1] && input[i] == input[i + 2]) count += 2
            else if (input[i] == input[i + 1]) count++
            else if (input[i + 1] == input[i + 2]) count++
        }
        if (i == input.length - 2) {
            if (input[i] == input[i + 1]) count++
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}