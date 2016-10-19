package business;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RunAdvice {
	@Around("execution(public void gogekList())")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작 : 핵심 메소드 수행 전에 id검사");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input id:");
		String id = scanner.nextLine();
		System.out.println("input pw:");
		String pw = scanner.nextLine();
		scanner.close();
		if(!id.equals("aa")){
			System.out.println("id 불일치! 작업을 종료 합니다");
			return null;
		}else if(!pw.equals("123")){
			System.out.println("pw 불일치! 작업을 종료 합니다");
			return null;
		}
		
		Object object = joinPoint.proceed(); //핵심로직 수행
		
		System.out.println("AOP 종료");
		return object;
	}
}
