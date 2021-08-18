package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }

    var cnt25 = 0
    var cnt50 = 0
    var ans = true

    for (i in 0 until n) {
        if (inputs[i] == 25) cnt25++
        else if (inputs[i] == 50) {
            if (cnt25 >= 1) {
                cnt25--
                cnt50++
            } else {
                ans = false
                break
            }
        } else if (inputs[i] == 100) {
            if (cnt25 >= 1 && cnt50 >= 1) {
                cnt25--
                cnt50--
            } else if (cnt25 >= 3) cnt25 -= 3
            else {
                ans = false
                break
            }
        }
    }

    if (ans) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}