package com.sysintelli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sysintelli.model.Register;
@Controller
@SessionAttributes("register")
public class RegisterController {

	@Autowired
	private Register RegisterService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		Register register = new Register();
		model.addAttribute("register", register);
		return "register";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	  public String register(@Validated @ModelAttribute("register") Register register, BindingResult result, Model model) {        
	      if(result.hasErrors()) {
	          return "register";
	      } else if(RegisterService.setUsername(register.getUsername())) {
	          model.addAttribute("message", "User Name exists. Try another user name");
	          return "register";
	      } else {
	          RegisterService.save(register);
	          model.addAttribute("message", "Saved customer details");
	          return "redirect:login.html";
	      }
}
}
