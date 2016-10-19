package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.MemDaoInter;

@Controller
public class InsertController {
	@Autowired
	private MemDaoInter daoInter;
	
	@RequestMapping("command")
	public MemBean formBack(){
		return new MemBean();
	}
	
	@RequestMapping(value="insert", method=RequestMethod.GET)
	public String insert(){
		return "insform"; //뷰네임 
	}
	
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public String submit(MemBean bean){
		Boolean b = daoInter.insertData(bean);
		if(b)
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
}



















