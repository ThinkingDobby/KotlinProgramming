package practice.baekjoon.section12
// 시간 초과
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arrX = IntArray(n)
    val arrY = IntArray(n)

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        arrX[i] = st.nextToken().toInt()
        arrY[i] = st.nextToken().toInt()
    }

    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (arrX[j] > arrX[j + 1]) {
                var tmp = arrX[j]
                arrX[j] = arrX[j + 1]
                arrX[j + 1] = tmp
                tmp = arrY[j]
                arrY[j] = arrY[j + 1]
                arrY[j + 1] = tmp
            }
        }
    }

   for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (arrX[j] == arrX[j + 1] && arrY[j] > arrY[j + 1]) {
                val tmp2 = arrY[j]
                arrY[j] = arrY[j + 1]
                arrY[j + 1] = tmp2
            }
        }
    }

    for (i in 0 until n) bw.write("${arrX[i]} ${arrY[i]}\n")

    bw.flush()
    bw.close()
}