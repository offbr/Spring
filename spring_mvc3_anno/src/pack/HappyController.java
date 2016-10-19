package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("happy*")
public class HappyController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView tvn(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HappyController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 해피겟");
		modelAndView.setViewName("view1");
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView ebs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HappyController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 해피포스트");
		modelAndView.setViewName("view2");
		return modelAndView;
	}
}
