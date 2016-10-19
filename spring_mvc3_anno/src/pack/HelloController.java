package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
@Controller
public class HelloController{
	//@RequestMapping("hello.do")
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 헬로우 - get");
		modelAndView.setViewName("view1");
		return modelAndView;
	}
	
	@RequestMapping(value="hello", method=RequestMethod.POST)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 헬로우 - post");
		modelAndView.setViewName("view1");
		return modelAndView;
	}
}
*/

@Controller
//@RequestMapping("hello")
@RequestMapping({"hello*", "mbc/hi"})
public class HelloController{
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 헬로우 - get - ok");
		modelAndView.setViewName("view1");
		return modelAndView;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 헬로우 - post - ok");
		modelAndView.setViewName("view1");
		return modelAndView;
	}
}






