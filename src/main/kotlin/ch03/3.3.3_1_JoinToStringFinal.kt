package ch03.JoinToStringFinal

fun <T> Collection<T>.joinToString( // Collection<T> の拡張関数の宣言
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) { // this はレシーバオブジェクトである T のコレクションを参照する
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
}

