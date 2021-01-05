package doit.chap10.section3

import java.io.*

fun main() {
    val path = "c:\\Users\\chiho\\OneDrive\\바탕 화면\\　\\프로그래밍\\test\\Over the Rainbow.txt"

    File(path).inputStream().bufferedReader().use{println(it.readText())}
}