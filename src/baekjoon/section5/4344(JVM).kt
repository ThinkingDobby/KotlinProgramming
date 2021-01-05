package practice.baekjoon.section5
// 소수점 반올림
import java.io.*
import java.util.*

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    val case = br.readLine()!!.toInt()

    repeat(case) {
        val st = StringTokenizer(br.readLine())
        val studentNum = st.nextToken().toInt()
        val scoreList = ArrayList<Int>(studentNum)
        repeat(studentNum) {
            val tmp = st.nextToken().toInt()
            scoreList.add(tmp)
        }
        var sum: Double = 0.0
        repeat(studentNum) {
            if (scoreList[it] > scoreList.average()) ++sum
        }
        val tmp2: Double = sum / studentNum * 100
        bw.write("%.3f".format(tmp2) + "%\n")
    }
    bw.flush()
    bw.close()
}