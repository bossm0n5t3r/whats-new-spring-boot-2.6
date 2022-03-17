package dev.bossm0n5t3r.blogger.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService {
    @Autowired
    private lateinit var commentService: CommentService
}
