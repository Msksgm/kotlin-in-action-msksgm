package ch09.ex1_1_1_GenericFunctionsAndProperties

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice(0..2))
    println(letters.slice(10..12))
}
