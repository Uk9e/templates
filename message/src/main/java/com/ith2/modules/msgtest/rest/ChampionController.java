package com.ith2.modules.msgtest.rest;

import com.ith2.modules.msgtest.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/champion")
public class ChampionController {

	@Autowired
	private ChampionService championService;

	@GetMapping("/send/{id}")
	public void send(@PathVariable Long id) {
		championService.send(id);
	}

}
