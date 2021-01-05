package codeforces.practice.year20.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val vowels = mutableListOf('a', 'e', 'i', 'o', 'u', 'y')
    val s = br.readLine().toLowerCase().filter { it !in vowels }.map { ".$it" }

    s.forEach { bw.write(it) }

    bw.flush()
    bw.close()
}