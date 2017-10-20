package io.aditya.sprintbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Topic {
	// @entity annotation  will tell JPA to create a table and that table will have
	//3 columns id,name and description
	
	//We need to map this object instances in the database and each topic should go as
	// columns in the database and each instance should go as rows
	
	//We should also tell JPA what the primary key is ( In a Relational DB every table 
	//Should have a primary key so we use annotation @Id
	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic() { 
		
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
