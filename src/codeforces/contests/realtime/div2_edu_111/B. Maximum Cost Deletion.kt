package codeforces.contests.realtime.div2_edu_111
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        val input = br.readLine()

        var count0 = 0
        var count1 = 0
        for (i in 0 until n) {
            if (input[i] == '0') count0++
            else count1++
        }

        var sum = 0
        var count = 1
        for (i in 0 until n - 1) {
            if (input[i] == '0') {
                if (input[i + 1] == '0') count++
                else {
                    sum += count * a + b
                    count = 1
                }
            }
        }
        sum += count1 * a + b

        var temp = 0
        count = 1
        for (i in 0 until n - 1) {
            if (input[i] == '1') {
                if (input[i + 1] == '1') count++
                else {
                    temp += count * a + b
                    count = 1
                }
            }
        }
        temp += count0 * a + b
        sum = Math.max(sum, temp)

        sum = Math.max(sum, n * a + n * b)


        bw.write("$sum")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}
