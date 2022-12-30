package by.vitalylobatsevich.teachme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TeachMeApplication

fun main(args: Array<String>) {
    runApplication<TeachMeApplication>(*args)
}
