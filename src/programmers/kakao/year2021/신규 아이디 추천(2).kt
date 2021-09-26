package programmers.kakao.year2021

import java.io.*

class Solution2 {
    fun solution(new_id: String) = new_id.toLowerCase()
            .filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }
            .replace("\\.+".toRegex(), ".")
            .removePrefix(".").removeSuffix(".")
            .let { if (it.isEmpty()) "a" else it }  // null 이 아닌 경우 코드 실행, 결과 반환
            .let { if (it.length > 15) it.substring(0..14) else it }.removeSuffix(".")
            .let {
                if (it.length <= 2)
                    StringBuilder(it).run {
                        while (length < 3) append(it.last())    // run: 객체에 포함된 함수를 실행
                        toString()  // 결과 반환
                    }
                else it
            }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}