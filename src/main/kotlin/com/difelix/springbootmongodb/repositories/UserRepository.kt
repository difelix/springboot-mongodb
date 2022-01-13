package com.difelix.springbootmongodb.repositories

import com.difelix.springbootmongodb.domain.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String>