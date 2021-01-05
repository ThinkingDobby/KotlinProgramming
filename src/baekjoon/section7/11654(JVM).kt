package practice.baekjoon.section7
// ASCII 변환
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.read()
    bw.write("$input")
    bw.flush()
    bw.close()
}