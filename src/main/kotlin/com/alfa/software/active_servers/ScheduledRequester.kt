package com.alfa.software.active_servers

import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class ScheduledRequester (@Value("\${server.one}") private val url : String, @Value("\${server.two}") private val urlTwo : String){
    private val webClient = WebClient.create();

    @Scheduled(fixedRate = 5 * 60 * 1000)
    fun sendRequests(){
        println("Hijo de perra $urlTwo")
        if(url != "disabled"){
            webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String::class.java)
                .doOnNext { response ->
                    println("Respuesta del servidor: $response")
                }
                .onErrorResume { ex ->
                    Mono.empty()
                }
                .subscribe()
        }

        if(urlTwo != "disabled"){
            webClient.get()
                .uri(urlTwo)
                .retrieve()
                .bodyToMono(String::class.java)
                .doOnNext { response ->
                    println("Respuesta del servidor: $response")
                }
                .onErrorResume { ex ->
                    Mono.empty()
                }
                .subscribe()
        }
    }

}