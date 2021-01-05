package codeforces.contests.realtime.div3_690
// 참조한 코드
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    for (i in 1..t) {
        val x = br.readLine().toInt()
        if (x > 45) {
            bw.write("-1\n")
            continue
        }

        var tmp = x
        var num = 9
        val ans = mutableListOf<Int>()

        while (tmp > 0) {
            if (tmp >= num) {
                tmp -= num
                ans.add(num)
            }
            num--
        }
        bw.write("${ans.asReversed().joinToString("")}\n")
    }

    bw.flush()
    bw.close()
}
