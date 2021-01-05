package practice.baekjoon.section7
// ASCII -> 알파벳
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val arr = Array(26) { -1 }

    for (j in 'a'..'z'){
        for (i in 0 until input.length) {
            if (input[i] == j) {
                arr[j - 'a'] = i
                break
            }
        }
    }

    for (k in arr) bw.write("$k ")

    bw.flush()
    bw.close()
}