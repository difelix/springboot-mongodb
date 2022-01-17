package com.difelix.springbootmongodb.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "post")
data class Post(
   @Id
   var id: String? = null,
   var date: LocalDate? = LocalDate.now(),
   var title: String? = null,
   var body: String? = null,
   var author: User? = null
)
