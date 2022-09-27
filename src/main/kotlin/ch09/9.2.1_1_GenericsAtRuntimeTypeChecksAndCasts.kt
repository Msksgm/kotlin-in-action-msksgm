package ch09.ex2_1_1_GenericsAtRuntimeTypeChecksAndCasts

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw IllegalStateException("List is expected")
    println(intList.sum())
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3)) // 全て期待通りに動作する
//    printSum(setOf(1, 2, 3)) // セットはリストではないので例外がスローされる
//    printSum(listOf("a", "b", "c")) // キャストが成功したあとに、別の例外がスローされる
}
