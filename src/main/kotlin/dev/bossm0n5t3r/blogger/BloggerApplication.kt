package dev.bossm0n5t3r.blogger

import dev.bossm0n5t3r.blogger.model.AuthorProperties
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.server.CookieSameSiteSupplier
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableConfigurationProperties(AuthorProperties::class)
class BloggerApplication {
    @Bean
    fun cookieSameSiteSupplier(): CookieSameSiteSupplier {
        return CookieSameSiteSupplier.ofStrict().whenHasName("mycookie")
    }
}

fun main(args: Array<String>) {
//    runApplication<BloggerApplication>(*args)
    val app = SpringApplication(BloggerApplication::class.java).apply {
        this.applicationStartup = BufferingApplicationStartup(10000)
    }
    app.run(*args)
}
