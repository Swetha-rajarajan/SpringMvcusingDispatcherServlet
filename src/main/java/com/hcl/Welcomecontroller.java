package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcomecontroller {
	
@RequestMapping("/")	
public String welcomeMsg(ModelMap bank) {
		
		bank.addAttribute("Myname","Swetha");
		bank.addAttribute("Myarea", "Arcot");
		bank.addAttribute("Myinterest", "Movies");
		return "index";

}
}
