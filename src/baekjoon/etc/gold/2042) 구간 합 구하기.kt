package baekjoon.etc.gold
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()
    val k = st1.nextToken().toInt()

    val a = Array(n) { br.readLine().toLong() }
    val tree = Array(n * 4) { 0L }

    init(a, tree, 1, 0, n - 1)

    for (i in 0 until m + k) {
        val st = StringTokenizer(br.readLine())
        val tmp = st.nextToken().toInt()
        val first = st.nextToken().toInt()
        val second = st.nextToken().toLong()
        if (tmp == 1) {
            val diff = second - a[first - 1]
            update(tree, 1, 0, n - 1, first - 1, diff)
        } else {
            bw.write("${sum(tree, 1, 0 , n - 1, first - 1, second.toInt() - 1)}")
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}

private fun init(a: Array<Long>, tree: Array<Long>, node: Int, start: Int, end: Int): Long {
    if (start == end) {
        tree[node] = a[start]
        return tree[node]
    } else {
        tree[node] = init(a, tree, 2 * node, start, (start + end) / 2) +
                init(a, tree, 2 * node + 1, (start + end) / 2 + 1, end)
        return tree[node]
    }
}

private fun sum(tree: Array<Long>, node: Int, start: Int, end: Int, left: Int, right: Int): Long {
    if (end < left || start > right) return 0L
    else if (start >= left && end <= right) return tree[node]
    else return sum(tree, node * 2, start, (start + end) / 2, left, right) +
            sum(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right)
}

private fun update(tree: Array<Long>, node: Int, start: Int, end: Int, index: Int, diff: Long) {
    if (index < start || index > end) return
    tree[node] += diff
    if (start != end) {
        update(tree, 2 * node, start, (start + end) / 2, index, diff)
        update(tree, 2 * node + 1, (start + end) / 2 + 1, end, index, diff)
    }
}
