package com.spring.SpringRestMongoDemo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Items")
public class CategoryCollection {
	
	@Id
	private String id;
	private String name;
	public CategoryCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryCollection(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CategoryCollection [id=" + id + ", name=" + name + "]";
	}
	
	

}
