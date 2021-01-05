package codeforces.contests.realtime.div3_690

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        val inputs = br.readLine()

        var isRight = false

        if (inputs[0] == '2') {
            if (inputs[n - 3] == '0' && inputs[n - 2] == '2' && inputs[n - 1] == '0') {
                isRight = true
            }
        }
        if (inputs[0] == '2' && inputs[1] == '0' && inputs[2] == '2') {
            if (inputs[n - 1] == '0') {
                isRight = true
            }
        }
        if (inputs[0] == '2' && inputs[1] == '0') {
            if (inputs[n - 2] == '2' && inputs[n - 1] == '0') {
                isRight = true
            }
        }
        if (inputs[0] == '2' && inputs[1] == '0' && inputs[2] == '2' && inputs[3] == '0') isRight = true
        if (inputs[n - 4] == '2' && inputs[n - 3] == '0' && inputs[n - 2] == '2' && inputs[n - 1] == '0') isRight = true

        if (isRight) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}