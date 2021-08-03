package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
	@Autowired
	private MemberRegisterService memberRegisterService;

	@RequestMapping({ "/", "/main" })
	public String main() {
		return "main";
	}

	@RequestMapping("/register/step1")
    public String handleStep1() {   return "register/step1";
}
