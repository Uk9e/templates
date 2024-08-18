package com.ith2.modules.msgtest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ith2.modules.msgtest.domain.ChampionEntity;
import lombok.SneakyThrows;

public interface ChampionService extends IService<ChampionEntity> {

	@SneakyThrows
	void send(Long id);
}
