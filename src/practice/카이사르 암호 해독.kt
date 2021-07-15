package practice

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    for (i in 1 until 26) {
        for (j in input) {
            if (j == ' ') {
                bw.write(" ")
                continue
            }
            val temp = j - 'a'
            bw.write("${'a' + (temp + i) % 26}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}