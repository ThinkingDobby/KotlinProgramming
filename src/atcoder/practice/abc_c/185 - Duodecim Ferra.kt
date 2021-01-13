package atcoder.practice.abc_c
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val p = Array(201){Array(201){0}}

    p[1][1] = 1
    for (i in 1..200) {
        for (j in 1..i) {
            if (i == 1 || j == i) p[i][j] = 1
            else p[i][j] = p[i - 1][j - 1] + p[i - j][j]
        }
    }

    val n = br.readLine().toInt()
    val k = br.readLine().toInt()



    bw.flush()
    bw.close()
}