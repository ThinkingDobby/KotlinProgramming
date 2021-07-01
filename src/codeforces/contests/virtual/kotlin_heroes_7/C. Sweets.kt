package codeforces.contests.virtual.kotlin_heroes_7
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()
        val sweets = br.readLine()

        val likes = LinkedList<Int>()
        for (i in sweets.indices) {
            if (sweets[i] == '1') {
                likes.add(i + 1)
            }
        }

        val table = LinkedList<Int>()
        for (i in 0 until n) {
            table.add(i + 1)
        }

        var now = 1
        var count = 0

        while (true) {
            if (likes.isEmpty()) break
            println(likes)
            println(table)
            count++
            table.remove(now)
            if (now in likes) likes.remove(now)

            if (table.isEmpty()) break
            now = table[(now - 1 + k) % table.size]
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}


