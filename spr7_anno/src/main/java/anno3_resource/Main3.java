package anno3_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
	public static void main(String[] args) {
		String metas[] = new String[]{"anno3.xml", "anno3_1.xml"};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(metas); //두개를 다 읽음
		
		AbcProcess abcProcess = (AbcProcess)context.getBean("abcProcess");
		abcProcess.showData();
	}
}
