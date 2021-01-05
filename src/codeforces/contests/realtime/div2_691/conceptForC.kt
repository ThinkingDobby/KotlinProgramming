package codeforces.contests.realtime.div2_691

import java.io.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toLong()
    val m = br.readLine().toLong()

    println(gcd(n, m))
    println(gcd(n, abs(n - m)))
}

private fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}

/*
gcd(x, y) = gcd(x, x- y)

일반적 계산 수행 시 시간 초과 오류 발생하므로
위의 원리를 이용해 풀이

-> a1 + x, a2 + x, ... , an + x 의 gcd 는
a1 + x, a2 - a1, a3 - a1, ... , an - a1 의 gcd와 동일 (x값과 상관 없이)

즉, a2 - a1, a3 - a1, ... , an - a1의 gcd 구해 놓은 후
x 값(b1, b2, ... , bm) 바꿔가며 계산하면 답을 구할 수 있음
 */