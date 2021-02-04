package atcoder.practice.abc_c

import java.io.*
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toLong()
    val ans = LinkedList<Long>()

    var i = 1L
    while (true) {
        if (i > sqrt(n.toDouble())) break
        if (n % i == 0L) {
            if (i == n / i) ans.add(i)
            else {
                ans.add(i)
                ans.add(n / i)
            }
        }
        i++
    }

    ans.sorted().forEach { bw.write("$it\n") }

    bw.flush()
    bw.close()
}