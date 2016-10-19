package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;
import pack.model.BoardDto;

@Controller
public class UpdateController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView up(@RequestParam("num") String num){
		BoardDto dto = boardDao.detail(num);
		return new ModelAndView("uform", "dto", dto); //뷰네임 
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String submit(BoardBean bean){
		Boolean b = boardDao.updateDate(bean);
		if(b)
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
	
	/*
	@RequestMapping("write")
	public Model processSelect(Model model){
		model.addAttribute("data", inter.list());
		return model; //요청명이 파일명
	}
	*/
}
