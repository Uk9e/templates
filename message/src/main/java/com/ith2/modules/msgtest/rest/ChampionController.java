package com.ith2.modules.msgtest.rest;

import com.ith2.modules.msgtest.service.ChampionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/champion")
public class ChampionController {

	private final ChampionService championService;

	@GetMapping("/id/{id}")
	public Object send(@PathVariable Long id) {
		return championService.getById(id);
	}

	@GetMapping("/list")
	public Object send() {
		return championService.list();
	}

}
