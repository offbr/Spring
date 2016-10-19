package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "헬로우");
		modelAndView.setViewName("view1");
		return modelAndView;
	}
}
