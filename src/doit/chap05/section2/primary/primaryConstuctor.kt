package chap05.section2.primary

class Bird(_name: String, _wing: Int, _beak: String, _color: String) {
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val bird1 = Bird("mybird", 2, "long", "blue")

    println("bird1.name: ${bird1.name}")
}
