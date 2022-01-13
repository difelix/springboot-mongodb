package com.difelix.springbootmongodb.resources.exception

import com.difelix.springbootmongodb.services.exception.ObjectNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ExceptionHandler {

   @ExceptionHandler(ObjectNotFoundException::class)
   fun objectNotFoundException(ex: ObjectNotFoundException, request: HttpServletRequest)
           : ResponseEntity<StandardException> {
      val httpStatus = HttpStatus.NOT_FOUND
      val error = StandardException(
         timestamp = System.currentTimeMillis(),
         error = "Objeto não encontrado.",
         status = httpStatus.value(),
         message = ex.message,
         path = request.requestURI
      )
      return ResponseEntity.status(httpStatus).body(error)
   }

}