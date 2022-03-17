package dev.bossm0n5t3r.blogger.controller

import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.reactive.server.WebTestClient

@WebMvcTest(PostController::class)
internal class PostControllerTest {
    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun findAllPosts() {
        webTestClient
            .get()
            .uri("/posts")
            .exchange()
            .expectStatus().isOk
            .expectBody().jsonPath("$.size", Matchers.`is`(3))
    }
}
