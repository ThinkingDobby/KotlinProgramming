package chap03.section3

fun noParam(out: ()->String) = println(out())
fun oneParam(out: (String)->String) = println(out("One Param"))
fun moreParam(out: (String, String)-> String) = println(out("More", "Param"))
fun withArgs(a: String, b: String, out: (String, String)->String) = println(out(a,b))

fun main() {
    noParam({ "Hello World" })
    noParam { "Hello World" }

    oneParam({a->"Hello $a"})
    oneParam{a->"Hello $a"}
    oneParam{"Hello $it"}

    moreParam{a,b -> "Hello $a $b"}
    moreParam{_,b -> "Hello $b"}    // 매개변수 하나만 쓰고 싶을 때

    withArgs("with","args",{a,b->"Func $a $b"})
    withArgs("with", "args"){a,b->"Func $a $b"} // 함수의 마지막 인자가 람다식은 경우 분리 가능
}