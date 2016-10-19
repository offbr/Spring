package pack.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;
import pack.model.BoardDto;

@Controller
public class DetailController {
	@Autowired
	private BoardDao boardDao;
		
	@RequestMapping("detail")
	public Model processDetail(Model model, @RequestParam("num") String num){
		boardDao.updateReadcnt(num); //조회수 증가
		BoardDto dto = boardDao.detail(num);
		model.addAttribute("dto", dto);
		return model; //요청명이 파일명
	}
	
	/*
	@RequestMapping("detail")
	public ModelAndView listProcess(@RequestParam("num") String num){
		BoardDto dto = boardDao.detail(num);
		return new ModelAndView("detail", "dto", dto);
	}
	*/
}





