package ch02.ex3_2_3_WhenEnums2

import ch02.colors.Color
import ch02.colors.Color.*

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
}
