package dev.bossm0n5t3r.blogger.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController {
    @GetMapping("/posts/{name}/{name}")
    fun findPostByAuthor(@PathVariable name: String) {
        println("name: $name")
    }
}
