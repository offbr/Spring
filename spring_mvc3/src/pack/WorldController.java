package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WorldController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("WorldController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "월드");
		modelAndView.setViewName("view2");
		return modelAndView;
	}
}
