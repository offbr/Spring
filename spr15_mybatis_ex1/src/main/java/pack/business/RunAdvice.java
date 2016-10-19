package pack.business;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pack.model.CompanyDto;
import pack.model.DaoInter;

@Component
@Aspect
public class RunAdvice {
	
	@Autowired
	private DaoInter daointer;
	
	@Around("execution(public void dataShow())")
	public Object login(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작 : 핵심 메소드 수행 전 검사");
	
		System.out.print("사번 : ");
		Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();

		for (CompanyDto d : daointer.sawonList()) {
			if (no.equals(d.getSawon_no()) && name.equals(d.getSawon_name())) {
				Object object = joinPoint.proceed();
				System.out.println("AOP 종료");
				return object;
			}
		}
		System.out.println("인증 실패. 작업을 종료합니다.");
		return null;
		
	}
}
