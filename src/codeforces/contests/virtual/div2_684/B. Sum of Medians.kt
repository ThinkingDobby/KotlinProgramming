package codeforces.contests.virtual.div2_684
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val k = st1.nextToken().toInt()

        val inputs = Array(n * k + 1) { 0 }
        val st2 = StringTokenizer(br.readLine())
        for (i in 1 until inputs.size) {
            inputs[i] = st2.nextToken().toInt()
        }


        val tmp: Int
        if (n % 2 == 0) {
            tmp = n / 2
        } else {
            tmp = n / 2 + 1
        }



        bw.newLine()
    }

    bw.flush()
    bw.close()
}