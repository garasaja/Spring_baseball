package com.cos.kbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.kbo.model.Stardium;
import com.cos.kbo.repository.StardiumRepository;
import com.cos.kbo.service.StardiumService;

@Controller
public class StardiumController {

	@Autowired
	StardiumService stardiumService;
	@Autowired
	StardiumRepository stardiumRepository;
	
	@GetMapping("/stardiumlist")
	public String stardiumList(Model model) {
		model.addAttribute("stardium", stardiumRepository.findAll());
		
	   return "stardiumList";
	}
	//
	@GetMapping("/stardium")
	public String stardiumSave() {
		
	   return "stardiumSaveForm";
	}
	
	@PostMapping("/stardium/save")
	public String stardiumSave(Stardium stardium) {
		stardiumService.save(stardium);
		 return "redirect:";
	}
}
