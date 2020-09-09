package com.cos.kbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.kbo.model.Player;
import com.cos.kbo.model.Stardium;
import com.cos.kbo.model.Team;
import com.cos.kbo.repository.PlayerRepository;
import com.cos.kbo.repository.TeamRepository;

@Service
public class OutPlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	@Transactional
	public void save(Player player) {
		playerRepository.save(player);
	}
	
	@Transactional
	public List<Player> findPlayerAll() {
		return playerRepository.findAll();
	}
}
