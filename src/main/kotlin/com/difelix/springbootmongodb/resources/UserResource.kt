package com.difelix.springbootmongodb.resources

import com.difelix.springbootmongodb.domain.User
import com.difelix.springbootmongodb.resources.dto.UserDTO
import com.difelix.springbootmongodb.resources.mappers.toUserDTOList
import com.difelix.springbootmongodb.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/users")
class UserResource(
   private val userService: UserService
) {

   @GetMapping
   @ResponseBody
   @ResponseStatus(HttpStatus.OK)
   fun findAll() : MutableList<UserDTO> {
      val userList: MutableList<User> = userService.findAll()
      return userList.toUserDTOList()
   }

}