package chap08.section1

interface InterfaceA
interface InterfaceB

class HandlerA: InterfaceA, InterfaceB
class HandlerB: InterfaceA
class ClassA<T> where T:InterfaceA, T:InterfaceB

fun main() {
    val obj1 = ClassA<HandlerA>()
    //val obj2 = ClassA<HandlerB>()
}