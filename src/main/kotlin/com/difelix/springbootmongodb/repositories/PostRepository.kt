package com.difelix.springbootmongodb.repositories

import com.difelix.springbootmongodb.domain.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : MongoRepository<Post, String>