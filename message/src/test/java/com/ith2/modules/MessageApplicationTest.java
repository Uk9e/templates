package com.ith2.modules;

import com.ith2.modules.msgtest.service.ChampionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class MessageApplicationTest {

	@Autowired
	private ChampionService championService;

	@Test
	public void contextLoads() {
		championService.list().forEach(System.out::println);
	}
}
