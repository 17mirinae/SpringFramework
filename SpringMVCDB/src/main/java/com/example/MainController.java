package com.example;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	@Autowired
	private MemberDao memberDao;

	@GetMapping(value = "/list")
	public String list(Model model) {
		List<Member> memberList = memberDao.selectAll();
		model.addAttribute("members", memberList);
		return "list";
	}
}
