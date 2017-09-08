package com.spring.SpringRestMongoDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.SpringRestMongoDemo.collections.UserSession;

public interface SessionRepository extends MongoRepository<UserSession, String>{

}
