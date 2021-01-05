package practice.baekjoon.etc.platiinum

import java.io.*
import java.util.*
import kotlin.math.ceil

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

var result1 = true
var result2 = true

fun main() {
    val n = br.readLine().toInt()

    val newArr = Array(n + 1) { 0 }
    val st = StringTokenizer(br.readLine())
    for (i in 1..n) newArr[i] = st.nextToken().toInt()

    forward(newArr, 1, n)
    if(!result1) reverse(newArr, n, 1)

    bw.flush()
    bw.close()
}

fun forward(arr: Array<Int>, target: Int, n: Int) {
    val arrTmp = arr.clone()
    var cnt = 0
    var ans =""
    var a = target
    while (a != n) {
        for (i in a..n) {
            if (a == arrTmp[a]) break
            if (arrTmp[i] == a) {
                cnt++
                arrRev(arrTmp, a, i)
                ans += "$a $i\n"
            }
        }
        a++
    }

    when (cnt) {
        1 -> {
            bw.write("1 1\n")
            bw.write(ans)
        }
        2 -> bw.write(ans)
        else -> result1 = false
    }
}

fun reverse(arr: Array<Int>, target: Int, n: Int) {
    val arrTmp = arr.clone()
    var cnt = 0
    var ans =""
    var a = target
    while (a != n) {
        for (i in a downTo n) {
            if (a == arrTmp[a]) break
            if (arrTmp[i] == a) {
                cnt++
                arrRev(arrTmp, i, a)
                ans += "$i $a\n"
            }
        }
        a--
    }

    when (cnt) {
        1 -> {
            bw.write("1 1\n")
            bw.write(ans)
        }
        2 -> {
            bw.write(ans)
        }
        else -> {
            bw.write("1 1\n1 1\n")
            result2 = false
        }
    }
}

fun arrRev(arr: Array<Int>, a: Int, b: Int) {
    val n = ceil((b - a) / 2.0).toInt()
    for (i in 0 until n) {
        val tmp = arr[a + i]
        arr[a + i] = arr[b - i]
        arr[b - i] = tmp
    }
}