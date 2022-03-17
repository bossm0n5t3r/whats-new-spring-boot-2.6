package dev.bossm0n5t3r.blogger.controller

import java.time.LocalDateTime
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SettingsController {
    companion object {
        @JvmStatic
        private val POSTS_PER_PAGE = "postsPerPage"
        @JvmStatic
        private val POSTS_PER_PAGE_DEFAULT = 5
    }

    @GetMapping
    @ResponseBody
    fun set(session: HttpSession, response: HttpServletResponse): Int {
        var value = session.getAttribute(POSTS_PER_PAGE) as Int?
        if (value == null) {
            value = POSTS_PER_PAGE_DEFAULT
            session.setAttribute(POSTS_PER_PAGE, value)
        }
        response.addCookie(Cookie("mycookie", LocalDateTime.now().toString()))
        return value
    }
}
