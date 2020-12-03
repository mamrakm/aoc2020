package sk.mamrakm

import sk.mamrakm.ReadDataInput.readDataFileInput
import java.io.File
import java.nio.file.Paths

object Day2 {
    fun part2() {
        val pathToData = Paths.get(File("").absolutePath, "src/main/resources/aoc2.data")
        val data = readDataFileInput(pathToData)
        val l = data.filter {
            val (passwordFormat, password) = it.split(":")
            val (occurrencesRange, char) = passwordFormat.split(" ")
            val (lowRange, highRange) = occurrencesRange.split("-")
            val result =
                ((password.trim()[lowRange.toInt() - 1] == char[0]) && (password.trim()[highRange.toInt() - 1] != char[0]))
                        || ((password.trim()[lowRange.toInt() - 1] != char[0]) && (password.trim()[highRange.toInt() - 1] == char[0]))
//            println("${password.trim()} (${char}) lr(lowRange) hr(${highRange}) = ${password[lowRange.toInt() - 1]} ${password[highRange.toInt() - 1]}  = ${result}")
            result
        }.size
        println(l)
    }
}