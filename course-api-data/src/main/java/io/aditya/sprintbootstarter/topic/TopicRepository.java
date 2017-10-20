package io.aditya.sprintbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	//getAllTopis
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	/* Since these are the default methods We dont need all these methods and we dont need 
	 a class infact just an interface
	is fine. Sring data jpa will provide these default methods so changing this class to 
	interface  */
	
	//Crud repository is a spring jpa interface
//CrudRepository< this is  class we need to create the db , this is type of primarykey>
}
