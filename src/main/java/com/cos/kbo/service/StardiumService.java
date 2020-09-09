package com.cos.kbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.kbo.model.Stardium;
import com.cos.kbo.repository.StardiumRepository;

@Service
public class StardiumService {

	@Autowired
	StardiumRepository stardiumRepository;
	
	@Transactional
	public void save(Stardium stardium) {
		stardiumRepository.save(stardium);
	}
	
	@Transactional
	public List<Stardium> findStardiumAll() {
		return stardiumRepository.findAll();
	}
}
