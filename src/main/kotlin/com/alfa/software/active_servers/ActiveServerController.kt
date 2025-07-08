package com.alfa.software.active_servers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ActiveServerController {
    @GetMapping("/")
    fun index() : ResponseEntity.BodyBuilder = ResponseEntity.ok()
}



