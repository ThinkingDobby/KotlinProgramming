package practice.baekjoon.section12
// 참조한 코드, average 함수, sort 함수
import java.io.*
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = IntArray(n)

    for (i in 0 until n) arr[i] = br.readLine().toInt()

    bw.write("${arr.average().roundToInt()}\n")

    arr.sort()
    bw.write("${arr[n / 2]}\n")

    val count = IntArray(8001) { 0 }
    for (i in arr) count[i + 4000]++

    var max = 0
    var maxnum = 0
    for (i in 1 until count.size) {
        if (count[max] < count[i]) {
            max = i     // 개수가 가장 많은 수
            maxnum = 0  // 중복여부 확인
        } else if (count[max] == count[i]) {
            if (maxnum == 0) {
                max = i
                maxnum = 1
            }
        }
    }

    bw.write("${max - 4000}\n")

    bw.write("${arr.last() - arr.first()}\n")

    bw.flush()
    bw.close()
}