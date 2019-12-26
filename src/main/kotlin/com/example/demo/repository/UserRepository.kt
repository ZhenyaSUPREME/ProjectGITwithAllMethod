package com.example.demo.repository

import com.example.demo.model.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository:ReactiveMongoRepository<User,String>