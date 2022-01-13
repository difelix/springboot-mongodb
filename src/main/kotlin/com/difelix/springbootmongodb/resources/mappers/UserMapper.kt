package com.difelix.springbootmongodb.resources.mappers

import com.difelix.springbootmongodb.domain.User
import com.difelix.springbootmongodb.resources.dto.UserDTO

fun User.toUserDTO() = UserDTO(
   id = this.id,
   name = this.name,
   email = this.email
)

fun MutableList<User>.toListUserDTO() =
   this.map { user ->
      user.toUserDTO()
   }.toMutableList()