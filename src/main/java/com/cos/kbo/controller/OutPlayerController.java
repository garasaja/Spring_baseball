package com.cos.kbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cos.kbo.repository.OutPlayerRepository;

@Controller
public class OutPlayerController {
	
	@Autowired
	OutPlayerRepository outPlayerRepository;
}
