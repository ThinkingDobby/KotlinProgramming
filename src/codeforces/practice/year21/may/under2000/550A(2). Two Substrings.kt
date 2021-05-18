package codeforces.practice.year21.may.under2000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()

    var satisfyAB = false
    var satisfyBA = false
    var special = 0
    var i = 1
    while (true) {
        if (s.length <= 1) break
        if (i >= s.length) break
        if (special > 1) break
        if (satisfyAB && satisfyBA) break

        if (s[i - 1] == 'A' && s[i] == 'B') {
            if (i < s.length - 1 && s[i + 1] == 'A') {
                special++
                if (i < s.length - 2) i += 2
                else break
            } else {
                satisfyAB = true
                i++
            }
        } else if (s[i - 1] == 'B' && s[i] == 'A') {
            if (i < s.length - 1 && s[i + 1] == 'B') {
                special++
                if (i < s.length - 2) i += 2
                else break
            } else {
                satisfyBA = true
                i++
            }
        }

        i++
    }

    if ((satisfyAB && satisfyBA) || (special == 1 && (satisfyAB || satisfyBA)) || special >= 2) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}