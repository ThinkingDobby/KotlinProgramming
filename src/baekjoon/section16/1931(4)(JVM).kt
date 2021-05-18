package baekjoon.section16
// 참조한 코드: compareBy 사용
import java.io.*
import java.util.*

//data class Time(val start:Int, val end:Int)

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val n=readLine().toInt()
    val bw=BufferedWriter(OutputStreamWriter(System.`out`))

    val timeTable= mutableListOf<Time>()
    for(i in 0 until n){
        val st=StringTokenizer(readLine())
        timeTable.add(i,Time(st.nextToken().toInt(),st.nextToken().toInt()))
    }

    val result=timeTable.sortedWith(compareBy({it.end},{it.start}))
    var count=1
    var end=result[0].end
    for(i in 1 until n){
        if(result[i].start>=end){
            count++
            end=result[i].end
        }
    }
    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}