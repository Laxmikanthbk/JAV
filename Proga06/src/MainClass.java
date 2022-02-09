

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainClass {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ac=new AnnotationConfigApplicationContext(bean.class);
		marks m=ac.getBean("getMarks",marks.class);
		student s=ac.getBean("getStudent",student.class);
		
		System.out.println("enter the student id");
		s.setId(sc.nextInt());
		System.out.println("enter the student name");
		s.setName(sc.next());
		
		System.out.println("enter mark1");
		m.setS1(sc.nextInt());
		System.out.println("enter mark1");
		m.setS2(sc.nextInt());
		System.out.println("enter mark1");
		m.setS3(sc.nextInt());
		System.out.println(s.toString());
	}
}