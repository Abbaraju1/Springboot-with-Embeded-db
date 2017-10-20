package io.aditya.sprintbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// This is a Business Service

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> geAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id){
		/*return topics.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst().get();*/
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// JAVA 7 way to update the list
		
		/*for(int i=0; i< topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/

		//Tried JAVA 8 // need more practice
		/*topics.set(IntStream.range(0, topics.size())
				.filter(t-> topics.get(t).getId().equals(id))
				.findFirst()
				.getAsInt(), topic);*/
		
		topicRepository.save(topic); //save will do both update and save save will 
		//check weather the topic is the same as anyother id in the db it it is it will
		//update else it will create or add another topic
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}

}
