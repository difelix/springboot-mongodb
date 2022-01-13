package com.difelix.springbootmongodb.resources.exception

data class StandardException(
   val timestamp: Long? = null,
   val status: Int? = null,
   val error: String? = null,
   val path: String? = null,
   val message: String? = null
)
