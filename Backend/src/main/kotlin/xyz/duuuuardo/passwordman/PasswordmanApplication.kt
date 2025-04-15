package xyz.duuuuardo.passwordman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PasswordmanApplication

fun main(args: Array<String>) {
	println("Hello from PasswordMan")
	println("Starting spring web server")

	runApplication<PasswordmanApplication>(*args)
}