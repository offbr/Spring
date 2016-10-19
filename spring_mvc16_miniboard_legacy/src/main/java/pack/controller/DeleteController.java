package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.BoardDao;

@Controller
public class DeleteController {
	@Autowired
	private BoardDao boardDao;

	@RequestMapping("delete")
	public String del(@RequestParam("num") String num){
		if(boardDao.deleteDate(num))
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
}

