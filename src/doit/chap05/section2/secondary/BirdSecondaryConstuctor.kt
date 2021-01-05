package chap05.section2.secondary

class Bird {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {     // 생성자: 객체 생성 시 기본적으로 호출되는 함수
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "Short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}