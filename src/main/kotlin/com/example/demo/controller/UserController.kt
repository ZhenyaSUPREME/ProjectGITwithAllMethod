package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/user")
class UserController(var userRepository: UserRepository){
    @GetMapping
    fun getAllList(): Flux<User> {
        return userRepository.findAll()
    }
}
