package com.cos.kbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.kbo.model.Stardium;
import com.cos.kbo.model.Team;
import com.cos.kbo.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	TeamRepository teamRepository;
	
	@Transactional
	public void save(Team team) {
		teamRepository.save(team);
	}
	
	@Transactional
	public List<Team> findTeamAll() {
		return teamRepository.findAll();
	}
}
