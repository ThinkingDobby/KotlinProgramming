package codeforces.practice.year20.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()

    val first = (a + b) * c
    val second = a + (b * c)
    val third = (a * b) + c
    val fourth = a * (b + c)
    val fifth = a + b + c
    val sixth = a * b * c

    val arr = arrayOf(first, second, third, fourth, fifth, sixth)

    bw.write("${arr.max()}")

    bw.flush()
    bw.close()
}