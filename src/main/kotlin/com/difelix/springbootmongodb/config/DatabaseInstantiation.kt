package com.difelix.springbootmongodb.config

import com.difelix.springbootmongodb.domain.User
import com.difelix.springbootmongodb.repositories.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class DatabaseInstantiation(
   private val userRepository: UserRepository
) : CommandLineRunner {

   override fun run(vararg args: String?) {
      userRepository.deleteAll()

      val userList: MutableList<User> = mutableListOf(
         User(
            name = "Diego Felix",
            email = "diego@email.com"
         ),
         User(
            name = "Ze das Couves",
            email = "zedascouves@email.com"
         ),
         User(
            name = "Charlie Harper",
            email = "charlie.harper@email.com"
         )
      )

      userRepository.saveAll(userList)
   }
}