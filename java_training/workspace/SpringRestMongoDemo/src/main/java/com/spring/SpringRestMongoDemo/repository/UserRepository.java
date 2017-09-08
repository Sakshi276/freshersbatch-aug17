package com.spring.SpringRestMongoDemo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.spring.SpringRestMongoDemo.collections.UserCollection;

public interface UserRepository extends MongoRepository<UserCollection, String> {
	
	@Query(value="{userName: ?0, password: ?1}")
	public UserCollection login(String userName, String password);

}