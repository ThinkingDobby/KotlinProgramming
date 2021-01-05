package doit.chap10.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "c:\\Users\\chiho\\OneDrive\\바탕 화면\\　\\프로그래밍\\test\\hello.txt"
    val text = "안녕하세요! Hello World!\n"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (e: IOException) {
    }
}