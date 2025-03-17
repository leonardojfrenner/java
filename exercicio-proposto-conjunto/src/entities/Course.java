package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

	private String course;

	private List<Teacher> teachers = new ArrayList<>();
	private List<Student> students = new ArrayList<>();
	
	public Course(String course) {
		this.course = course;
	}

	public Course(String course, Teacher teacher, Student student) {
		this.course = course;
		addTeacher(teacher);
		addStudents(student);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<Teacher> getTeacher() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public List<Student> getStudent() {
		return students;
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}

	@Override
	public int hashCode() {
		return Objects.hash(students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Course [course=" + course + ", teachers=" + teachers + ", students=" + students + "]";
	}

}
