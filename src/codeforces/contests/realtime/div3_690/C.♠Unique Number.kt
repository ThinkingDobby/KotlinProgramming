package codeforces.contests.realtime.div3_690
// Hacked
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val x = br.readLine().toInt()

        if (x < 40) {
            for (i in 0 until 500000) {
                val tmp = i.toString()
                val isUsed = LinkedList<Char>()
                var sum = 0
                for (j in tmp) {
                    if (j !in isUsed) {
                        isUsed.add(j)
                        sum += j.toInt() - 48
                    } else {
                        break
                    }
                }
                if (sum == x) {
                    bw.write("$i")
                    break
                }
            }
        }

        when (x) {
            40 -> bw.write("1456789")
            41 -> bw.write("2456789")
            42 -> bw.write("3456789")
            43 -> bw.write("13456789")
            44 -> bw.write("23456789")
            45 -> bw.write("123456789")
        }

        if (x > 45) {
            bw.write("-1")
        }

    bw.newLine()
    }

    bw.flush()
    bw.close()
}