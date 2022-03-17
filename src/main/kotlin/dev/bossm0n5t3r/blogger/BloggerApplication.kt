package dev.bossm0n5t3r.blogger

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup
import org.springframework.boot.runApplication

@SpringBootApplication
class BloggerApplication

fun main(args: Array<String>) {
//    runApplication<BloggerApplication>(*args)
    val app = SpringApplication(BloggerApplication::class.java).apply {
        this.applicationStartup = BufferingApplicationStartup(10000)
    }
    app.run(*args)
}
