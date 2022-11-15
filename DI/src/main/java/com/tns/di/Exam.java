package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Student st= new Student(1, "chandan");
//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
         // Student st1 = context.getBean("student", Student.class);
  //  st1.displayStudentInfo();
		Student st= new Student(1, "chandan");
		st.displayStudentInfo();

}

}
