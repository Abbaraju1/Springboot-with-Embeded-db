package io.aditya.sprintbootstarter.lesson;

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
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> geAllCourses(String topicId){
		//return courses;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id){
		/*return courses.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst().get();*/
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		// JAVA 7 way to update the list
		
		/*for(int i=0; i< courses.size(); i++){
			Course t = courses.get(i);
			if(t.getId().equals(id)){
				courses.set(i, course);
				return;
			}
		}*/

		//Tried JAVA 8 // need more practice
		/*courses.set(IntStream.range(0, courses.size())
				.filter(t-> courses.get(t).getId().equals(id))
				.findFirst()
				.getAsInt(), course);*/
		
		courseRepository.save(course); //save will do both update and save save will 
		//check weather the course is the same as anyother id in the db it it is it will
		//update else it will create or add another course
	}

	public void deleteCourse(String id) {
		//courses.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}

}
