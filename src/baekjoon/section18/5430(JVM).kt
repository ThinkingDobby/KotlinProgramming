package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val command = br.readLine()
        val x = br.readLine().toInt()
        val input = br.readLine().split(",", "[", "]")
        val operatingList = LinkedList<String>()
        input.forEach { if (it != "") operatingList.add(it) }

        var error = false
        var ascending = true
        for (i in command.indices) {
            if (command[i] == 'R') {
                ascending = !ascending
            }
            if (command[i] == 'D') {
                if (operatingList.isEmpty()) {
                    error = true
                    break
                } else {
                    if (ascending) operatingList.poll()
                    else operatingList.pollLast()
                }
            }
        }

        if (error) {
            bw.write("error")
        } else {
            if (ascending) {
                bw.write("[${operatingList.joinToString(",")}]")
            } else {
                bw.write("[${operatingList.reversed().joinToString(",")}]")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}