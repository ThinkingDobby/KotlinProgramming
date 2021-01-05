package chap05.section2.init

class Bird(var name: String = "NoName", var wing: Int = 4, var beak: String, var color: String) {
    init {
        println("----------초기화 블록 시작----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("---------- 초기화 블록 끝 ----------")
        println()
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val bobo = Bird(beak = "long", color = "red")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.color = "yellow"
    println("bobo.color: ${bobo.color}")
    coco.fly()
    bobo.fly()
}