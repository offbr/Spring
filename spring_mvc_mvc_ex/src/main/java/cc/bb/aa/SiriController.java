package cc.bb.aa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SiriController {
	@Autowired
	SiriModel siriModel = new SiriModel();
	
	@RequestMapping(value="/siri", method=RequestMethod.GET)
	public ModelAndView siri(HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		
		String irum = request.getParameter("irum");
		if(irum == null){
			String msg = siriModel.getSiri();
			modelAndView.addObject("msg", msg);
		}else{
			String msg = irum + "님 " + siriModel.getSiri();
			modelAndView.addObject("msg", msg);
		}
		
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
