package dev.bossm0n5t3r.blogger.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController {
    @GetMapping("/posts")
    fun findAllPosts() = listOf("Post 1", "Post 2", "Post 3")

    @GetMapping("/posts/{name}/{name}")
    fun findPostByAuthor(@PathVariable name: String) {
        println("name: $name")
    }
}
