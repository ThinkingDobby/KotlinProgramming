package baekjoon.section15
// 참조한 코드: Comparator 사용
fun main() {
    val bw = System.out.bufferedWriter()
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    for(i in 0 until n){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        list.add(Pair(a, b))
    }
    list.sortWith(Comparator { o1, o2 ->
        if(o1.second == o2.second){
            o1.first - o2.first
        }else {
            o1.second - o2.second
        }
    })
    var count=1
    var end = list[0].second
    for(i in 1 until list.size){
        if(list[i].first >= end){
            count++
            end = list[i].second
        }
    }
    bw.write("$count")
    bw.flush()
}