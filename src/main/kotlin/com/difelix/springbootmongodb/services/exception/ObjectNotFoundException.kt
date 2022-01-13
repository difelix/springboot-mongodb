package com.difelix.springbootmongodb.services.exception

import java.lang.RuntimeException

class ObjectNotFoundException(
   msg: String? = null
) : RuntimeException(msg) {
}