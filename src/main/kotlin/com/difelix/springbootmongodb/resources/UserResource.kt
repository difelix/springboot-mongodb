package com.difelix.springbootmongodb.resources

import com.difelix.springbootmongodb.domain.User
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/users")
class UserResource {

   @GetMapping
   @ResponseBody
   @ResponseStatus(HttpStatus.OK)
   fun findAll() : List<User> {
      val user1 = User(
         id = "1",
         name = "Diego Felix",
         email = "diego@email.com"
      )

      val user2 = User(
         id = "2",
         name = "Ze das Couves",
         email = "zedascouves@email.com"
      )

      return mutableListOf(user1, user2)
   }

}