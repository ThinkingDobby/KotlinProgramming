package baekjoon.section19

import java.io.*
import java.util.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

private val st1 = StringTokenizer(br.readLine())
private val n = st1.nextToken().toInt()
private val b = st1.nextToken().toLong()

lateinit var baseMatrix: Array<IntArray>

fun main() {

    val matrix = Array(n) { IntArray(n) }
    baseMatrix = Array(n) { IntArray(n) }
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

    val ans = matrixPow(matrix, b)

    for (i in 0 until n) {
        for (j in 0 until n) {
            bw.write("${ans[i][j]} ")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}


fun matrixPow(arr: Array<IntArray>, num: Long): Array<IntArray> {
    if (num == 0L) return baseMatrix

    val tmp1 = matrixPow(arr, num / 2)
    val tmp2 = matrixMultiplication(tmp1, tmp1)

    if (num % 2 == 0L) {
        return tmp2
    } else {
        return matrixMultiplication(arr, tmp2)
    }
}

fun matrixMultiplication(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    val newMatrix = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            var sum = 0
            for (k in 0 until n) {
                sum += arr1[i][k] * arr2[k][j]
            }
            newMatrix[i][j] = sum % 1000
        }
    }
    return newMatrix
}