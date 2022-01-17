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

   fun delete(id: String) {
      findById(id)
      userRepository.deleteById(id)
   }

   fun update(userToUpdate: User) : User {
      val actualUser = findById(userToUpdate.id!!)
      val newUser = updateUserData(actualUser, userToUpdate)
      return userRepository.save(newUser)
   }

   private fun updateUserData(actualUser: User, updatedUser: User) : User {
      return actualUser.apply {
         this.name = updatedUser.name
         this.email = updatedUser.email
      }
   }

}