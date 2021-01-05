package practice.baekjoon.section3

import java.io.*

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    val cnt = Integer.parseInt(br.readLine())

    for (i in 1..cnt) {
        for (j in 1..(cnt - i)) {
            bw.write(" ")
        }
        for (k in 1..i) {
            bw.write("*")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}
