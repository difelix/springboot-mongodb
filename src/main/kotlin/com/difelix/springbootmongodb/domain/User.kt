package com.difelix.springbootmongodb.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(
   @Id
   var id: String? = null,
   var name: String? = null,
   var email: String? = null
)
