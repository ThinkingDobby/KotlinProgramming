package atcoder.contests.realtime.beginner_187
// TLE
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var ans = true

    val list = mutableListOf<String>()
    val noList = mutableListOf<String>()
    for (i in 0 until n) {
        val input = br.readLine()
        if (input[0] == '!') {
            val tmp = input.slice(1 until input.length)
            if (tmp in noList) {
                bw.write(tmp)
                ans = false
                break
            }
            list.add(tmp)
        } else {
            if (input in list) {
                bw.write(input)
                ans = false
                break
            }
            noList.add(input)
        }
    }

    if (ans) bw.write("satisfiable")

    bw.flush()
    bw.close()
}