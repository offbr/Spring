package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value="kbs/login", params="type=admin")
	public ModelAndView m1(){
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "관리자만세");
		return view;
	}
	
	@RequestMapping(value="kbs/login", params="type=user")
	public ModelAndView m2(){
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "일반인 화이팅");
		return view;
	}
	
	@RequestMapping(value="kbs/login", params="!type")
	public ModelAndView m3(){
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "인자가 없네요");
		return view;
	}
	
	@RequestMapping(value="kbs/{url}")
	public ModelAndView m4(@RequestParam("type") String type,
			@PathVariable String url){
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "기타 : " + type + " " + url);
		return view;
	}
	
	@RequestMapping(value="/ent/{co}/singer/{singer}")
	public ModelAndView m5(@RequestParam("title") String title,
			@PathVariable String co, @PathVariable String singer){
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		String ss = "소속사: " + co + ", 가수: " + singer + ", 타이틀: " + title;
		view.addObject("message", ss);
		return view;
	}
	
	
}











