package com.cos.kbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.kbo.model.Player;
import com.cos.kbo.model.Stardium;
import com.cos.kbo.repository.PlayerRepository;
import com.cos.kbo.service.PlayerService;

@Controller
public class PlayerController {

	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	PlayerService playerService;
	
	@GetMapping("/player")
	public String playerList(Model model) {
		model.addAttribute("team", playerRepository.findAll());
	   return "playerList";
	}
	
	@GetMapping("/playersave")
	public String playerSave() {
		
	   return "playerSaveForm";
	}
	
	@PostMapping("/player/save")
	public String player(Player player) {
		playerService.save(player);
		 return "redirect:";
	}
	
	
}
