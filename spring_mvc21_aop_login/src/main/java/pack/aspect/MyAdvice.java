package pack.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {
	@Autowired
	private LoginClass loginClass;
	
	@Around("execution(* getList*(..))")
	public Object aopProcess(ProceedingJoinPoint joinPoint) throws Throwable{
		HttpServletResponse response = null;
		HttpServletRequest request = null;
		
		// request,response를 구분한다.
		for(Object o :joinPoint.getArgs()){
			if(o instanceof HttpServletResponse){
				response = (HttpServletResponse) o;
			}
			if(o instanceof HttpServletRequest){
				request = (HttpServletRequest) o;
			}
		}
		
		//session check 후 로그인 하지 않은 경우 로그인 창으로 이동
		if(!loginClass.loginCheck(request, response)){
			return null;
		}
		
		Object object = joinPoint.proceed(); //핵심메소드 수행
		return object;
	}
}




