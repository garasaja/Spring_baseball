package com.cos.kbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.kbo.model.Stardium;
import com.cos.kbo.model.Team;
import com.cos.kbo.repository.TeamRepository;
import com.cos.kbo.service.TeamService;

@Controller
public class TeamController {

	@Autowired
	TeamService teamService;
	@Autowired
	TeamRepository teamRepository;

	@GetMapping("/team")
	public String teamList(Model model) {
		model.addAttribute("team", teamRepository.findAll());
		return "teamList";
	}

	@GetMapping("/teamsave")
	public String teamSaveForm() {
		return "teamSaveForm";
	}
	
	@PostMapping("/team/save")
	public String teamSave(Team team) {
		teamService.save(team);
		 return "redirect:";
	}
}
