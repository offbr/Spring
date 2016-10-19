package business;

import java.util.ArrayList;
import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.SawonDto;
import model.SawonImpl;
import model.SawonInter;

@Component
@Aspect
public class RunAdvice {
	
	@Autowired
	private SawonInter sawonInter;
	
	@Around("execution(public void sawonList())")
	public Object login(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작 : 핵심 메소드 수행 전에 id검사");
	
		System.out.print("사번 : ");
		Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();

		for (SawonDto s : sawonInter.selectAll()) {
			if (no.equals(s.getSawon_no()) && name.equals(s.getSawon_name())) {
				Object object = joinPoint.proceed();
				System.out.println("AOP 종료");
				return object;
			}
		}
		System.out.println("사번 인증 실패. 작업을 종료합니다.");
		return null;
		
	}
}
