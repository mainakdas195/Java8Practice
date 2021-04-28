package com.example.users.myinterface;

import java.util.Collections;
import java.util.List;

import com.example.users.model.Student;

public interface MyInterface {

	//You can not override any object class method in interface in java 8 because any class that implements
	// the interface is already extends the object class, so the compiler will get confused. So, you
	// will get compile error if you try to override object class method in interface.
	
	
	//you can override the default method in the implementing classes. but not static method.
	
	//If two interface have same default method and one class implements the two interfaces then that class
	//has to implement the default method.
		default public List<Student> sortStudent (List<Student> students) {
			Collections.sort(students);
			return students;
		}
		
		public static void greet(String name) {
			System.out.println("Hello " + name);
		}
		
		public Integer getMaxNumber(List<Integer> numbers);
}
