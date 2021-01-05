package codeforces.contests.realtime.div2_691

import java.io.*
import java.lang.Math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val check = Array(2001) { IntArray(2001) }

    fun func(x: Int, y: Int, direction: String, count: Int) {
        if (count == 0) {
            var tmpX = x
            var tmpY = y
            if (x < 0) tmpX = abs(tmpX) + 1000
            if (y < 0) tmpY = abs(tmpY) + 1000
            check[tmpX][tmpY] = 1
            return
        }
        if (direction == "west" || direction == "east") {
            func(x, y + 1, "north", count - 1)
            func(x, y - 1, "south", count - 1)
        }
        if (direction == "south" || direction == "north") {
            func(x + 1, y, "east", count - 1)
            func(x - 1, y, "west", count - 1)
        }
    }

    func(0, 0, "east", n)
    func(0, 0, "west", n)
    func(0, 0, "south", n)
    func(0, 0, "north", n)

    var ansCount = 0
    for (i in 0 until 2001) {
        for (j in 0 until 2001) {
            if (check[i][j] == 1) {
                ansCount++
            }
        }
    }

    bw.write("$ansCount")

    bw.flush()
    bw.close()
}