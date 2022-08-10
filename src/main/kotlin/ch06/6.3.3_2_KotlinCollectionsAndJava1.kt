package ch06.ex3_3_2_KotlinCollectionsAndJava1

import ch06.CollectionUtils

fun printInUpperCase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main(args: Array<String>) {
    val list = listOf("a", "b", "c")
    printInUpperCase(list)
}
