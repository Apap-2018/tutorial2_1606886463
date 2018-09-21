package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
//	url routing

	@RequestMapping("/generator")
	public String challenge(@RequestParam(value="a",required=false) Integer a, @RequestParam(value="b", required=false) Integer b, Model model) {
		if (a==null) {
			a=0;
		}
		if (b==null) {
			b=0;
		}
		String hm = "";
		String hmtemp ="h";
		if (a>1) {
			for (int i = 0; i < a; i++) 
			{hmtemp+="m";}	
		}
		else {
			hmtemp+="m";
		}
		if (b>1) {
			for (int i = 0; i < b; i++) 
			{hm+=" "+hmtemp;}
		}
		else {
			hm=hmtemp;
		}
		model.addAttribute("a", a);
		model.addAttribute("hm", hm);
		model.addAttribute("b", b);
		//html name routing
		return "generator";
	}

}

