package com.flight_reservation_app_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.enitities.User;
import com.flight_reservation_app_1.repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	
	
	@RequestMapping("/showReg")

	public String showReg() {
		return"login/showReg";
	}
	@RequestMapping(value="/saveReg",method=RequestMethod.POST)
	public String saveReg(@ModelAttribute User user,ModelMap modelMap) {
		userRepo.save(user);
		modelMap.addAttribute("msg", "Record Saved");
		return"login/showReg";
		
	}

	@RequestMapping("/showLogin")
	public String showLogin() {
		return"login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap modelMap) {
		try {
		
		User user=userRepo.findByEmail(email);
		if(user.getEmail().equals(email)&& user.getPassword().equals(password)) {
			return"searchFlight";
		}else {
			modelMap.addAttribute("msg", "Invalid UserName/password");
			return"login/login";
		}
		
		}catch(Exception e) {
			modelMap.addAttribute("msg", "Invalid UserName/password");
			return"login/login";
		}
			
	}

}
