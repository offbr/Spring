package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.CompanyDto;
import pack.model.DaoInter;

@Controller
public class ListController {
	
	@Autowired
	private DaoInter inter;
	
	@RequestMapping("list")
	public Model processSelectSawonList(Model model){
		model.addAttribute("blist", inter.buserDetail(""));
		model.addAttribute("slist", inter.selectList());
		return model; //요청명이 파일명
	}
	
	@RequestMapping("buserdetail")
	public Model processSelectBuserDetail(Model model, @RequestParam("b_no") String b_no){
		model.addAttribute("bdetail", inter.buserDetail(b_no));
		return model; //요청명이 파일명
	}
	
	@RequestMapping(value="buserSearch", method=RequestMethod.POST)
	public ModelAndView processSearch(@RequestParam("b_no") String b_no){
		List<CompanyDto> list = inter.buserSearch(b_no);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("list");
		modelAndView.addObject("slist", list);
		modelAndView.addObject("blist", inter.buserDetail(""));
		return modelAndView;
	}
	
}
