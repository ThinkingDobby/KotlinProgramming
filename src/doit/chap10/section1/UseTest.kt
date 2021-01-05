package doit.chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("c:\\Users\\chiho\\OneDrive\\바탕 화면\\　\\프로그래밍\\test\\output.txt")).use {
        it.println("hello")
    }

    val file = File("c:\\Users\\chiho\\OneDrive\\바탕 화면\\　\\프로그래밍\\test\\output.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}