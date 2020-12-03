package sk.mamrakm

import java.nio.file.Files
import java.nio.file.Path

object ReadDataInput {
    @JvmStatic
    public fun readDataFileInput(filePath: Path): List<String> {
        return Files.readAllLines(filePath)
    }
}