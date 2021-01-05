package practice

import java.io.*

private var x = 0
private var y = 0
private var gcd = 0
private var tmp = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n1 = br.readLine().toInt()
    val n2 = br.readLine().toInt()
    calcGCD(n1, n2)

    val n1Factor = n1 / gcd
    val n2Factor = n2 / gcd
    val lcm = n1Factor * n2Factor * gcd

    bw.write("$gcd")
    bw.newLine()
    bw.write("$lcm")

    bw.flush()
    bw.close()
}

private fun calcGCD(n1: Int, n2: Int) {
    if (n1 % n2 > 0) {
        calcGCD(n2, n1 % n2)
        tmp = y // x = y’, y = x’-(a/b)y’를 적용한 부분 (문서 참고)
        y = x - (n1 / n2) * y
        x = tmp
    } else {
        x = 0
        y = 1
        gcd = n2
    }
}