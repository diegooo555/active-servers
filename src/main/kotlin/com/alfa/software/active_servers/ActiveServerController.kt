package com.alfa.software.active_servers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ActiveServerController {
    @GetMapping("/")
    fun index(@RequestParam("name") name : String = "Diego"): String {
        return "$name the server is working."
    }
}



