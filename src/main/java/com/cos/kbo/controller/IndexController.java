package com.cos.kbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.kbo.model.Player;

@Controller
public class IndexController {

	@Autowired
	
	
	@GetMapping("/stardium/save")
	public String home() {
	   return "stardiumSaveForm";
	}
	

}
