package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemberDao;
import pack.model.MemberDto;

@Controller
public class ListController {
	@Autowired
	private MemberDao memberDao;
	
	/*
	@RequestMapping("list")
	public ModelAndView listProcess(){
		List<MemberDto> list = memberDao.getMemberList();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("list", list);
		return view;
	}
	*/
	
	//page 나누기
	private int pageSize = 3; //한 페이지 당 출력 행 수
	
	@RequestMapping("list") //list?pagnum=1
	public ModelAndView listProcess(@RequestParam(value="pagenum", defaultValue="1")String pagenum){
		int currentPage = Integer.parseInt(pagenum);
		int startRow = (currentPage - 1) * pageSize; //0, 3, 6, 9 .......
		int endRow = pageSize; // 페이지갯수
		int count = memberDao.getMemberCount(); //전체 갯수
		
		List<MemberDto> list = memberDao.getMemberList(startRow, endRow); //3개씩만 넘어온다
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("list", list);
		view.addObject("currentPage", currentPage);
		view.addObject("count", count);
		view.addObject("pageSize", pageSize);
		return view;
	}
}








