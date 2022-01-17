package com.difelix.springbootmongodb.config

import com.difelix.springbootmongodb.domain.Post
import com.difelix.springbootmongodb.domain.User
import com.difelix.springbootmongodb.repositories.PostRepository
import com.difelix.springbootmongodb.repositories.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class DatabaseInstantiation(
   private val userRepository: UserRepository,
   private val postRepository: PostRepository
) : CommandLineRunner {

   override fun run(vararg args: String?) {
      userRepository.deleteAll()
      postRepository.deleteAll()

      val user1 = User(name = "Diego Felix", email = "diego@email.com")
      val user2 = User(name = "Ze das Couves", email = "zedascouves@email.com")
      val user3 = User(name = "Charlie Harper", email = "charlie.harper@email.com")

      val post1 = Post(title = "Irmão mala", body = "Alan Harper me irrita!", author = user3)
      val post2 = Post(title = "Sobrinho legal", body = "Jake Harper é demais, ao contrário do Alan", author = user3)

      val userList: MutableList<User> = mutableListOf(user1, user2, user3)
      val postList: MutableList<Post> = mutableListOf(post1, post2)

      userRepository.saveAll(userList)
      postRepository.saveAll(postList)
   }
}