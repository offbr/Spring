package pack.aop2;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfileAdvice {
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		//핵심 메소드명 얻기
		String methodName = joinPoint.getSignature().toString();
		
		System.out.println(methodName + " 시작 전 작업...");
		Object object = joinPoint.proceed(); //핵심 메소드 수행
		System.out.println(methodName + " 처리 후 작업...");
		
		return object; //객체 처리를 위해 반환 해줘야 한다.
	}
}
