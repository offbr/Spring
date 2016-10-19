package bank.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bankinit.xml");
		try {
			BankUiInter inter = (BankUiInter)context.getBean("sBank");
			inter.startwork();			
		} catch (Exception e) {
			System.out.println("menu err: " + e);
		}
	}
}
