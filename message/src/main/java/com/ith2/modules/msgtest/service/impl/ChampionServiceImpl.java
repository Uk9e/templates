package com.ith2.modules.msgtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ith2.modules.msgtest.domain.ChampionEntity;
import com.ith2.modules.msgtest.mapper.ChampionMapper;
import com.ith2.modules.msgtest.service.ChampionService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChampionServiceImpl extends ServiceImpl<ChampionMapper, ChampionEntity> implements ChampionService {

	private static final String TOPIC = "test_topic";
	//引入mq的模板服务
	//private final RocketMQTemplate rocketMQTemplate;

	private final ObjectMapper om;

	@Override
	@SneakyThrows
	public void send(Long id) {
		ChampionEntity champion = getById(id);
		//rocketMQTemplate.convertAndSend(TOPIC, om.writeValueAsString(champion));
	}

}
