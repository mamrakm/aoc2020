package sk.mamrakm

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

object Main {
    @JvmStatic
//    Day 1
//    fun main(args: Array<String>) {
//        val pathToData = Paths.get(File("").absolutePath, "src/main/resources/aoc1.data")
//        val data = readDataFileInput(pathToData)
//        val dataLastIndex = data.size - 1
//        for (i in 0..dataLastIndex) {
//            for (j in i + 1..dataLastIndex) {
//                for (k in j + i..dataLastIndex) {
//                    val x = Integer.parseInt(data[i])
//                    val y = Integer.parseInt(data[j])
//                    val z = Integer.parseInt(data[k])
//                    if (x + y + z == 2020) {
//                        println("${x} + ${y} + ${z}== ${x + y + z}; multiply is ${x * y * z}")
//                    }
//                }
//            }
//        }
//    }

    fun main(args: Array<String>) {
        val pathToData = Paths.get(File("").absolutePath, "src/main/resources/aoc2.data")
        val data = readDataFileInput(pathToData)
        val l = data.filter {
            val (passwordFormat, password) = it.split(":")
            val (occurrencesRange, char) = passwordFormat.split(" ")
            val (lowRange, highRange) = occurrencesRange.split("-")
            val result =
                ((password.trim()[lowRange.toInt() - 1] == char[0]) && (password.trim()[highRange.toInt() - 1] != char[0]))
                        || ((password.trim()[lowRange.toInt() - 1] != char[0]) && (password.trim()[highRange.toInt() - 1] == char[0]))
            println("${password.trim()} (${char}) lr(lowRange) hr(${highRange}) = ${password[lowRange.toInt() - 1]} ${password[highRange.toInt() - 1]}  = ${result}")
            result
        }.size
        println(l)
    }

    @JvmStatic
    fun readDataFileInput(filePath: Path): List<String> {
        return Files.readAllLines(filePath)
    }
}