package io.aditya.sprintbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

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
	
	
	//************IMPORTANT INFO **************
	/*we dont need to implement this interface methods since spring will automtically
	do it for us based on the method name and the input param
	But we need to start the method name using "findBy" to let spring know that we
	are finding something*/
	/*example for above 
	 * public List<Course> findByName(String name);
	
	public List<Course> findByDescription(String foo);*/
	
	/*For topicId if the course has a string return type for topic then we could use 
	findByTopic and it would work but the course object has a parameter topic which
	returns a Object Topic. So here we need to tell spring the key/primary key of the topic
	as well or the key we are searching to let spring create the method based in the method
	name. here we are searching based on Id so we are using findbyTopicId where Topic is
	the Object and Id is the key. Id can we topicId if the Topic class has topicId instead
	of Id ( So the method Name will be findBYTopicTopicId)*/
			
	public List<Course> findByTopicId(String topidId);
	
}
