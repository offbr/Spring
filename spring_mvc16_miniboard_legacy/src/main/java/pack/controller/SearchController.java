package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;
import pack.model.BoardDto;

@Controller
public class SearchController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public ModelAndView processSearch(@RequestParam("name") String name, @RequestParam("value") String value){
		List<BoardDto> list = boardDao.search(name, value);
		return new ModelAndView("list", "list", list);
	}
}
	
