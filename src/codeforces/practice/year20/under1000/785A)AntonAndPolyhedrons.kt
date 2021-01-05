package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var count = 0

    val n = br.readLine().toInt()
    repeat(n) {
        when (br.readLine()) {
            "Tetrahedron" -> count += 4
            "Cube" -> count += 6
            "Octahedron" -> count += 8
            "Dodecahedron" -> count += 12
            "Icosahedron" -> count += 20
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}