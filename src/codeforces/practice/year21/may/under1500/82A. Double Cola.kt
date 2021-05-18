package codeforces.practice.year21.may.under1500
// TLE
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val queue = LinkedList<Char>()
    var count = 0
    queue.add('a')
    queue.add('b')
    queue.add('c')
    queue.add('d')
    queue.add('e')

    var temp = '0'

    while (true) {
        if (count == n) break
        temp = queue.poll()
        count++
        queue.add(temp)
        queue.add(temp)
    }

    when (temp) {
        'a' -> bw.write("Sheldon")
        'b' -> bw.write("Leonard")
        'c' -> bw.write("Penny")
        'd' -> bw.write("Rajesh")
        'e' -> bw.write("Howard")
    }

    bw.flush()
    bw.close()
}

fun printQueue(queue: LinkedList<Char>) {
    for (i in queue) {
        print("$i ")
    }
    println()
}