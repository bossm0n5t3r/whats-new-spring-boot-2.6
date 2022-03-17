package dev.bossm0n5t3r.blogger.model

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@JvmRecord
@ConfigurationProperties("blogger.author")
@ConstructorBinding
data class AuthorProperties(
    val firstName: String,
    val lastName: String,
    val email: String
)
