package entities;

import java.util.List;

public class Teacher {
	
	private String name;
	
	private List<Course> course;
	
	public Teacher(String name) {
		this.name = name;
	}

	public Teacher(String name,Course course) {
		this.name = name;
		addCourse(course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void addCourse(Course course) {
		this.course.add(course);
	}

	@Override
	public String toString() {
		return "Teacher: " + name;
	}
	
	
	
	

}
