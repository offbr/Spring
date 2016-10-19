package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	//구현된 메소드가 아니라 일반 메소드라 메소드 명이 달라도 된다.
	@RequestMapping("index.do")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("TestController 수행");
		//return new ModelAndView("list"); //뷰파일명;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("say", "버전 충돌 문제!!!!!!!!"); //request.setAttribute("say", "버전 충돌 문제");
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
