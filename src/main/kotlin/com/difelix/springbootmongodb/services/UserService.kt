package com.difelix.springbootmongodb.services

import com.difelix.springbootmongodb.domain.User
import com.difelix.springbootmongodb.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
   private val userRepository: UserRepository
) {

   fun findAll(): MutableList<User> = userRepository.findAll()

}