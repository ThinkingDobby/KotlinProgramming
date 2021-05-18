package baekjoon.section20

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toLong()

    fun calcMatrix(matrix1: Array<LongArray>, matrix2: Array<LongArray>): Array<LongArray> {
        val size = matrix1.size
        val newMatrix = Array(size) { LongArray(size) }
        for (i in 0 until size) {
            for (j in 0 until size) {
                var sum = 0L
                for (k in 0 until size) {
                    sum += matrix1[i][k] * matrix2[k][j]
                }
                newMatrix[i][j] = sum % 1_000_000_007
            }
        }
        return newMatrix
    }

    var ans = Array(2){LongArray(2)}
    var a = Array(2){LongArray(2)}

    ans[0][0] = 0
    ans[0][1] = 1
    ans[1][0] = 1
    ans[1][1] = 0

    a[0][0] = 1
    a[0][1] = 1
    a[1][0] = 1
    a[1][1] = 0

    while (n > 0) {
        if (n % 2 == 1L) {
            ans = calcMatrix(ans, a)
        }
        a = calcMatrix(a, a)
        n /= 2
    }

    bw.write("${ans[1][1]}")

    bw.flush()
    bw.close()
}