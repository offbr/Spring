package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.BoardDao;

@Controller
public class InsertController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("command")
	public BoardBean formBack(){
		return new BoardBean();
	}
	
	@RequestMapping(value="write", method=RequestMethod.GET)
	public String write(){
		return "wform"; //뷰네임 
	}
	
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String submit(BoardBean bean){
		Boolean b = boardDao.writeDate(bean);
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
