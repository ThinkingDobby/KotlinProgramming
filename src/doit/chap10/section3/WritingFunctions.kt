package doit.chap10.section3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "c:\\Users\\chiho\\OneDrive\\바탕 화면\\　\\프로그래밍\\test\\testfile.txt"

    val file = File(path)
    val pw = PrintWriter(file)

    pw.println(outString)
    pw.append(outString)
    pw.close()

    FileWriter(path, true).use {it.write(outString)}
}