package com.difelix.springbootmongodb.services

import com.difelix.springbootmongodb.domain.User
import com.difelix.springbootmongodb.repositories.UserRepository
import com.difelix.springbootmongodb.services.exception.ObjectNotFoundException
import org.springframework.stereotype.Service

@Service
class UserService(
   private val userRepository: UserRepository
) {

   fun findAll(): MutableList<User> = userRepository.findAll()

   fun findById(id: String) : User {
      return userRepository.findById(id).orElseThrow {
         ObjectNotFoundException(msg = "Usuário de Id [ $id ] não foi encontrado.")
      }
   }

   fun save(user: User) = userRepository.save(user)

}