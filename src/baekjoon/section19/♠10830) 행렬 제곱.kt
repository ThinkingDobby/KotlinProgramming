package baekjoon.section19
// 복기 시 '1629(2)곱셈' 참고할 것
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val b = st1.nextToken().toLong()

    val matrix = Array(n){IntArray(n)}
    val baseMatrix = Array(n){IntArray(n)}
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i + j == n - 1) {
                baseMatrix[i][j] = 1
            }
        }
    }

    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            matrix[i][j] = st2.nextToken().toInt()
        }
    }

    fun calcMatrix(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
        val newMatrix = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                var sum = 0
                for (k in 0 until n) {
                    sum += matrix1[i][k] * matrix2[k][j]
                }
                newMatrix[i][j] = sum % 1000
            }
        }
        return newMatrix
    }

    fun matrixPow(num: Long): Array<IntArray> {
        if (num == 0L) return baseMatrix

        val k = matrixPow(num / 2)
        val tmp = calcMatrix(k, k)

        if (num % 2 == 0L) {
            return tmp
        } else {
            return calcMatrix(matrix, tmp)
        }
    }

    val ans = matrixPow(b)

    for (i in 0 until n) {
        for (j in 0 until n) {
            bw.write("${ans[i][j]} ")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}