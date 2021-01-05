package practice.baekjoon.etc.silver
// 메모리 초과
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val list = MutableList(n){n - it}

    for (i in n - 1 downTo 1) {
        if (list.size == 1) break
        list.removeAt(list.lastIndex)
        val tmp = list.last()
        for (j in i - 1 downTo 1) {
            list[j] = list[j - 1]
        }
        list[0] = tmp
    }

    bw.write("${list[0]}")

    bw.flush()
    bw.close()
}