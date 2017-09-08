package com.spring.SpringRestMongoDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.SpringRestMongoDemo.collections.CategoryCollection;

public interface CategoryRepository extends MongoRepository<CategoryCollection, String>{

}
