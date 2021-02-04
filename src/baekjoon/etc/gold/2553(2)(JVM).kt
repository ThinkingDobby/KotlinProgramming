package practice.baekjoon.etc.gold
//WA
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    var ans = 1

    for (i in 2..n) {
        var tmp = i

        while (tmp % 10 == 0)
            tmp /= 10

        ans *= tmp

        while (ans % 10 == 0)
            ans /= 10

        ans %= 100000
    }
    println(ans % 10)
}