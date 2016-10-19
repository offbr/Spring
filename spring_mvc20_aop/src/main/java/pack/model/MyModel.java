package pack.model;

import org.springframework.stereotype.Repository;

@Repository
public class MyModel implements MyModelInter{
	@Override
	public String processMsg() {
		System.out.println("processMsg 핵심메소드 수행");
		return "Spring AOP process";
	}
	
	@Override
	public String businessMsg() {
		System.out.println("businessMsg 핵심메소드 수행");
		return "Spring AOP business";
	}
}
