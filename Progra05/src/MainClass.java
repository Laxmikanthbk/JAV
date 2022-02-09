import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		Scanner cc=new Scanner(System.in);
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		
		customer c=ac.getBean("customer",customer.class);
		System.out.println("enter the customer name ");
		c.setName(cc.next());
		System.out.println("enter the customer id");
		c.setId(cc.nextInt());
		System.out.println(c.toString());
		
		
		ticket t=ac.getBean("ticket",ticket.class);
		t.setCc(c);
		System.out.println("enter the ticket id");
		t.setTid(cc.nextInt());
		System.out.println("enter the ticket description");
		t.setDesc(cc.next());
		System.out.println(t.toString());
		
		
		
		
	}

}
