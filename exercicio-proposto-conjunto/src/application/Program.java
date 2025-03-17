package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Teacher teacher = new Teacher("Leo");
		List<Course> list = new ArrayList<>();
		Set<Student> set = new HashSet<>();

		list.add(new Course("A"));
		list.add(new Course("B"));
		list.add(new Course("C"));

		for (Course course : list) {
			course.addTeacher(teacher);

			System.out.print("How many students for course " + course.getCourse() +"? ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				set.add(new Student(sc.nextInt()));
			}
		}
		System.out.println("Total students: " + set.size());

		sc.close();

	}
}
