package practice.baekjoon.section13
// 참조한 코드
import java.util.*
import java.io.*

lateinit var s: Array<IntArray> // 지연초기화 - 밖에서 함수 구성하기 위함
lateinit var isUsed: BooleanArray
private var min = Integer.MAX_VALUE

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    s = Array(n){IntArray(n)}
    isUsed = BooleanArray(n)
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            s[i][j] = st.nextToken().toInt()
        }
    }

    func(0, 0)

    bw.write("$min")
    bw.flush()
    bw.close()
}

fun func(index: Int, depth: Int) {  // 중첩 함수로 구현 시 시간 초과
    if (depth == s.size / 2) {
        var start = 0
        var link = 0
        for (i in 0 until s.size - 1) {
            for (j in i + 1 until s.size) {
                if (isUsed[i] && isUsed[j]) {   // isUsed 에 없는 두개의 요소
                    start += s[i][j] + s[j][i]
                } else if (!isUsed[i] && !isUsed[j]) {  // isUsed 에 있는 두개의 요소
                    link += s[i][j] + s[j][i]
                }
            }
        }
        min = Math.min(min, Math.abs(start - link)) // 최솟값 계산
        return
    }

    for (i in index until s.size) {
        if (!isUsed[i]) {   // i가 isUsed 에 없는 경우
            isUsed[i] = true    // isUsed 에 널은 후
            func(i + 1, depth + 1) // 다음 요소(자기 자신과 불가하므로 +1), 다음 단계
            isUsed[i] = false   // return 후 초기화 (전 단계로 이동)
        }
    }
}