package sk.mamrakm

import sk.mamrakm.ReadDataInput.readDataFileInput
import java.io.File
import java.nio.file.Paths

object Day1 {
    @JvmStatic
    fun part1() {
        val pathToData = Paths.get(File("").absolutePath, "src/main/resources/aoc1.data")
        val data = readDataFileInput(pathToData)
        val dataLastIndex = data.size - 1
        for (i in 0..dataLastIndex) {
            for (j in i + 1..dataLastIndex) {
                val x = Integer.parseInt(data[i])
                val y = Integer.parseInt(data[j])
                if (x + y == 2020) {
                    println("${x} + ${y} == ${x + y}; multiply is ${x * y}")
                }
            }
        }
    }

    @JvmStatic
    fun part2() {
        val pathToData = Paths.get(File("").absolutePath, "src/main/resources/aoc1.data")
        val data = readDataFileInput(pathToData)
        val dataLastIndex = data.size - 1
        for (i in 0..dataLastIndex) {
            for (j in i + 1..dataLastIndex) {
                for (k in j + i..dataLastIndex) {
                    val x = Integer.parseInt(data[i])
                    val y = Integer.parseInt(data[j])
                    val z = Integer.parseInt(data[k])
                    if (x + y + z == 2020) {
                        println("${x} + ${y} + ${z}== ${x + y + z}; multiply is ${x * y * z}")
                    }
                }
            }
        }
    }
}