package pack.gogek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bankinit.xml");
		Gogek john = (Gogek)context.getBean("gogek");
		john.selBank("shinhan");
		john.playInputMoney(500);
		john.playOutputMoney(200);
		System.out.print("john - ");
		john.showMoney();
		
		System.out.println("/");
		
		Gogek jack = (Gogek)context.getBean("gogek");
		jack.selBank("shinhan");
		jack.playInputMoney(500);
		jack.playOutputMoney(200);
		System.out.print("jack - ");
		jack.showMoney();
		
		System.out.println("/");
		
		System.out.println(john.toString() + " / " + jack.toString());
		
		System.out.println("/");
		
		Gogek oscar = (Gogek)context.getBean("gogek");
		oscar.selBank("hana");
		oscar.playInputMoney(500);
		oscar.playOutputMoney(100);
		System.out.print("oscar -");
		oscar.showMoney();
		
		
	}
}
