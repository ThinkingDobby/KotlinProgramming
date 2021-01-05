package codeforces.practice.year20.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val newUsers = Array(n) { br.readLine() }

    val database = mutableMapOf<String, Int?>()

    for (i in 0 until n) {
        if (newUsers[i] in database.keys) {
            bw.write("${newUsers[i]}${database[newUsers[i]]}\n")
            database[newUsers[i]] = database[newUsers[i]]?.plus(1)
        } else {
            bw.write("OK\n")
            database.put(newUsers[i], 1)
        }
    }

    bw.flush()
    bw.close()
}