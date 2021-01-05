package practice.baekjoon.etc.gold

import java.io.*

val arr = Array(3072) {CharArray(6144)}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0..n) {
        for (j in 0..2 * n) {
            arr[i][j] = ' '
        }
    }
    star(n, n - 1, 0)

    for (i in 0..n) {
        for (j in 0..2 * n) {
            bw.write("${arr[i][j]}")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}

fun star(n: Int, x: Int, y: Int) {
    if (n == 3) {
        arr[y][x] = '*'
        arr[y + 1][x - 1] = '*'
        arr[y + 1][x + 1] = '*'
        arr[y + 2][x - 2] = '*'
        arr[y + 2][x - 1] = '*'
        arr[y + 2][x] = '*'
        arr[y + 2][x + 1] = '*'
        arr[y + 2][x + 2] = '*'
        return
    }

    star(n / 2, x, y)
    star(n / 2, x - (n / 2), y + (n / 2))
    star(n / 2, x + (n / 2), y + (n / 2))
}