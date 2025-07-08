package com.alfa.software.active_servers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class ActiveServersApplication

fun main(args: Array<String>) {
    runApplication<ActiveServersApplication>(*args)
}
