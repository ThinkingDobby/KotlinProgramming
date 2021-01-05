package codeforces.contests.virtual.div2_edu_100
// Wrong Answer
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val monsters = Array(3) { st.nextToken().toInt() }

        if (monsters.sum() % 9 == 0 && monsters.min()!! >= monsters.sum() / 9) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}