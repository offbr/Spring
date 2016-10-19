package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("TestController 수행");
		//return new ModelAndView("list"); //뷰파일명;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("say", "버전 충돌 문제"); //request.setAttribute("say", "버전 충돌 문제");
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
