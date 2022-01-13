package com.difelix.springbootmongodb.resources.dto

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class UserDTO(
   val id: String? = null,
   val name: String? = null,
   val email: String? = null
)
