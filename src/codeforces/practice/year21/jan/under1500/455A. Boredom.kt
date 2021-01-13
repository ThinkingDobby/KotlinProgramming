package codeforces.practice.year21.jan.under1500
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var elements = LinkedHashMap<Long, Long>()
    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        val tmp = st.nextToken().toLong()
        if (tmp !in elements.keys) {
            elements[tmp] = 1
        } else {
            elements[tmp] = elements[tmp]!! + 1
        }
    }

    val sortedElements = elements.toList().sortedByDescending { it.first * it.second }.toMap()
    elements = sortedElements as LinkedHashMap<Long, Long>

    var sum = 0L
    while (true) {
        println(elements)
        if (elements.isEmpty()) break
        val tmp = elements.keys.first()
        elements.remove(tmp + 1)
        elements.remove(tmp - 1)
        if (elements[tmp] != null) {
            sum += tmp * elements[tmp]!!
            elements.remove(tmp)
        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}