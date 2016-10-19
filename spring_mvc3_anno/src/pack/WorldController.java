package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorldController{
	//@RequestMapping("world") //파일명 비교 *.do를 준건 web.xml을 거쳐서 오려고 준 것.
	//@RequestMapping({"/world", "/world2", "good"})
	@RequestMapping({"/world*", "good"})
	public ModelAndView jtbc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("WorldController 수행");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 월드");
		modelAndView.setViewName("view2");
		return modelAndView;
	}
}
