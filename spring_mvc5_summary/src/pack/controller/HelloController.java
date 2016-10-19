package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import pack.model.HelloModel;

/*
public class HelloController implements Controller{	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return null;
	}
}
*/

public class HelloController extends AbstractController{
	private HelloModel hellomodel;
	
	public void setHellomodel(HelloModel hellomodel) {
		this.hellomodel = hellomodel;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String result = hellomodel.getGreeting(); //모델과 통신
		
		//ModelAndView modelAndView = new ModelAndView("hello"); //forward (기본값)
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("hello");//forward (기본값) //서버를 통해 전달
		modelAndView.setViewName("redirect:/hello.jsp"); //redirect(풀패스 : 경로, 확장자까지 줘야한다.) //클라이언트를 통해 부름
		modelAndView.addObject("result", result); //redirect방식은 갱신되므로 값을 전달 못한다.
		return modelAndView;
	}
}












