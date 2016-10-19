package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("arrange.xml"); //이건 colse() 닫아줄수가 없다
	
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pack/arrange.xml");
		
		//3.0.0 이후에 이걸로 쓴다;
		//GenericXmlApplicationContext context =  new GenericXmlApplicationContext("arrange.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MessageImpl impl1 = (MessageImpl) context.getBean("mbean");
		MessageImpl impl2 = (MessageImpl) context.getBean("mbean");
		
		System.out.println(impl1 + " / " + impl2);
		
		impl1.sayHi();
		
		System.out.println("====================================================");
		//다형성
		//MessageInter inter = (MessageInter)context.getBean("mbean");		
		//MessageInter inter = (MessageImpl)context.getBean("mbean");
		MessageInter inter = context.getBean("mbean", MessageInter.class);
		inter.sayHi();
		
		context.close();
	}
}


















