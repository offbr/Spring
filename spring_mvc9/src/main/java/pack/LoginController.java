package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@ModelAttribute("command") //@ModelAttribute는 다른 어노테이션 보다 우선순위가 높다
	public LoginFormBean formBack(){
		//어쩌구 저쩌구 
		// 로직
		return new LoginFormBean();
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String form(){
		return "loginform"; //파일명
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String submit(LoginFormBean formBean){
		if(formBean.getUserid().equals("aa") && formBean.getPasswd().equals("11")){
			return "redirect:/list"; //목록보기
		}else{
			return "loginform"; //재 입력화면
		}
	}
}

















