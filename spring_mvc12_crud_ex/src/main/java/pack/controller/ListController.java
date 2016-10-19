package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.CompanyDao;
import pack.model.GogekDto;
import pack.model.SawonDto;

@Controller
public class ListController {
	@Autowired
	private CompanyDao companyDao;
	
	@RequestMapping("sawonlist")
	public ModelAndView slistProcess(){
		List<SawonDto> list = companyDao.getSawonList();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("sawonlist");
		view.addObject("slist", list);
		return view;
	}
	
	@RequestMapping("gogeklist")
	public ModelAndView glistProcess(@RequestParam("s_no") String s_no){
		List<GogekDto> list = companyDao.getGogekList(s_no);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("gogeklist");
		view.addObject("glist", list);
		return view;
	}
	
}
