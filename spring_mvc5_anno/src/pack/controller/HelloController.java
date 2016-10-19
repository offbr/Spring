package pack.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pack.model.HelloModel;

@Controller
//@RequestMapping("/hello.do")
@RequestMapping({"/hello.do","abc/world.do", "hi", "k*", "mbc", "sbs"})
public class HelloController{
	@Autowired
	private HelloModel hellomodel;

	/*
	@RequestMapping(method=RequestMethod.GET)
	protected ModelAndView abc() {
		String result = hellomodel.getGreeting(); //모델과 통신
		
		//ModelAndView modelAndView = new ModelAndView("hello"); //forward (기본값)
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("redirect:/hello.jsp"); //redirect(풀패스 : 경로, 확장자까지 줘야한다.) //클라이언트를 통해 부름
		modelAndView.setViewName("hello");//forward (기본값) //서버를 통해 전달
		modelAndView.addObject("result", result); //redirect방식은 갱신되므로 값을 전달 못한다.

		return modelAndView;
	}
	*/
	/*
	@RequestMapping(method=RequestMethod.GET) //요청명이 곧 URL
	protected Map<String, Object> abc() {
		String result = hellomodel.getGreeting(); //모델과 통신
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("result", result); 
		//view 파일명은 요청명과 동일하게 작성해 준다.
		return map;
	}
	*/
	
	@RequestMapping(method=RequestMethod.GET) //요청명이 곧 URL
	protected Model abc(Model model) {
		String result = hellomodel.getGreeting(); //모델과 통신
		
		model.addAttribute("result", result);
		
		//view 파일명은 요청명과 동일하게 작성해 준다.
		return model;
	}
}












