package ch05.ex3_1_1_ExecutingSequenceOperations

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence().map { println("map($it) "); it * it }.filter { print("filter($it) "); it % 2 == 0 }
}
