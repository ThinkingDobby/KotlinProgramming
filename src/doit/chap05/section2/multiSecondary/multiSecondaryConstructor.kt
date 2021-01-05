package chap05.section2.multiSecondary

class Bird {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }
}

fun main() {
    val bird1 = Bird("mybird", 2, "short", "blue")
    val bird2 = Bird("mybird2", "long")

    println("bird1.color: ${bird1.color}")
    println("bird2.color: ${bird2.color}")
}