package practice.baekjoon.section13
// 스도쿠, 재귀, dfs
import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(9) { IntArray(9) }

    val width = Array(9) {BooleanArray(10)} // 각 칸에 들어갈 수 있는 실제 숫자: 0~9이므로 두번째 범위 10으로 설정
    val height = Array(9) {BooleanArray(10)}
    val square = Array(9) {BooleanArray(10)}

    for (i in 0 until 9) {
        val st = StringTokenizer(br.readLine(), " ")
        for (j in 0 until 9) {
            arr[i][j] = st.nextToken().toInt()
            if (arr[i][j] != 0) {
                width[i][arr[i][j]] = true  // 가로가 i이고 숫자가 □일 때
                height[j][arr[i][j]] = true // 세로가 i이고 숫자가 □일 때
                square[(i / 3) * 3 + j / 3][arr[i][j]] = true   // 구역이 △(계산으로 확인)이고 숫자가 □일 때 이미 사용됨을 나타냄
            }
        }
    }

    fun func(now: Int) {
        val x = now / 9 // x 좌표
        val y = now % 9 // y 좌표
        if (now == 81) {
            for (i in 0 until 9) {
                for (j in 0 until 9) {
                    bw.write("${arr[i][j]} ")
                }
                bw.newLine()
            }
            bw.flush()
            bw.close()
            exitProcess(0)  // 재귀호출된 함수들 모두 종료
        }
        if (arr[x][y] == 0) {
            for (i in 1..9) {
                if (!width[x][i] && !height[y][i] && !square[(x / 3) * 3 + y / 3][i]) {
                    width[x][i] = true
                    height[y][i] = true
                    square[(x / 3) * 3 + y / 3][i] = true
                    arr[x][y] = i
                    func(now + 1)   // func 가 깨진 경우 = 실패한 경우
                    arr[x][y] = 0       // 그러므로 원상 복구
                    width[x][i] = false
                    height[y][i] = false
                    square[(x / 3) * 3 + y / 3][i] = false
                }
            }
        }
        else func(now + 1)  // 0이 아닌 경우에만 패스하며 now + 1
    }

    func(0)
}