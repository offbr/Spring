package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app_init.xml");
		
		SelectService selectService = (SelectService)context.getBean("selectServiceImpl");
		selectService.selectProcess();
	}
}
