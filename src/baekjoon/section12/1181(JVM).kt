package practice.baekjoon.section12
// 중복 제거
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { " " }
    val check = ArrayList<String>()

    repeat(n) {
        arr[it] = br.readLine()
    }

    arr.sort()

    for (i in n - 1 downTo 0) {
        for (j in 0 until i) {
            if (arr[j].length > arr[j + 1].length) {
                val tmp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = tmp
            }
        }
    }

    for (i in arr)
        if (!check.contains(i))
            check.add(i)

    for (i in check)
        bw.write("$i\n")

    bw.flush()
    bw.close()
}