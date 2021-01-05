package doit.chap10.section3

import java.io.*

fun main() {    // 파일 저장 시 일반 텍스트 문서로 저장, UTF-8로 인코딩해야 한국어가 정상 출력됨
    val path = "c:\\Users\\chiho\\OneDrive\\바탕 화면\\　\\프로그래밍\\test\\Over the Rainbow.txt"

    FileReader(path).use{println(it.readText())}
}