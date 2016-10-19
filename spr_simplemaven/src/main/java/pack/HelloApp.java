package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		System.out.println();
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("mb1");
		inter2.sayHello("짜장면");
		inter2 = (MessageInter)context.getBean("mb2");
		inter2.sayHello("짬뽕");
	}
}
