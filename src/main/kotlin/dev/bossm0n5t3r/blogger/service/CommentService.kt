package dev.bossm0n5t3r.blogger.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CommentService {
    @Autowired
    private lateinit var postService: PostService
}
