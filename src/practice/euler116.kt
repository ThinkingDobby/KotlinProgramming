package practice

import java.io.*
//174
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = 50
    var rc = 0
    var gc = 0
    var bc = 0

    //https://codepractice.tistory.com/25

}

private fun comb(a: Int, b: Int, max: Int): Int {
    val comb = Array(max + 1) { Array(max + 1) { 1 } }
    for (i in 2..max) {
        for (j in 0..i) {
            if (j == 0 || j == i) comb[i][j] = 1
            else comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]
        }
    }

    return comb[a][b]
}