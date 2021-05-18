package codeforces.practice.year21.may.under2000
// WA
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()

    var satisfyAB = false
    var satisfyBA = false
    var special = 0
    var i = 1
    if (s.length <= 1) bw.write("NO")
    else {
        while (true) {
            if (!satisfyAB && !satisfyBA && s[i - 1] == 'A' && s[i] == 'B') {
                if (i != s.length - 1 && s[i + 1] == 'A') {
                    special++
                    i++
                } else satisfyAB = true
            } else if (!satisfyBA && !satisfyAB && s[i - 1] == 'B' && s[i] == 'A') {
                if (i != s.length - 1 && s[i + 1] == 'B') {
                    special++
                    i++
                } else satisfyBA = true
            } else {
                if (satisfyAB && !satisfyBA && i != s.length - 1 && s[i] == 'B' && s[i + 1] == 'A') {
                    if (i < s.length - 2 && s[i + 2] == 'B') special++
                    else satisfyBA = true
                }
                if (satisfyBA && !satisfyAB && i != s.length - 1 && s[i] == 'A' && s[i + 1] == 'B') {
                    if (i < s.length - 2 && s[i + 2] == 'A') special++
                    else satisfyAB = true
                }
            }

            i++
            if (satisfyAB && satisfyBA) break
            if (i >= s.length) break
        }

        if ((satisfyAB && satisfyBA) || (special > 1) || (special == 1 && (satisfyAB || satisfyBA))) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }
    }

    bw.flush()
    bw.close()
}