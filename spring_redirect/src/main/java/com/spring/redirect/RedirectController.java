package com.spring.redirect;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	
	@RequestMapping(value="/a")
	public String a(RedirectAttributes rttr) {
		String url = "redirect:/receive";
		
		//rttr.addAttribute("name", "kim");
		//rttr.addAttribute("message","good day!");
		
		rttr.addFlashAttribute("name","kim");
		
		return url;
	}
	
	@RequestMapping(value="/receive")
	public void receive(Model model) {}
	
}
