package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;
import pack.model.BoardDto;

@Controller
public class ListController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("list")
	public ModelAndView listProcess(){
		List<BoardDto> list = boardDao.list();
		return new ModelAndView("list", "list", list);
	}
}
