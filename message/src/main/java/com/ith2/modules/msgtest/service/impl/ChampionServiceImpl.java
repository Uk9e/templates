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
	private final RocketMQTemplate rocketMQTemplate;

	private final ObjectMapper om;

	@Override
	@SneakyThrows
	public void send(Long id) {
		ChampionEntity champion = getById(id);
		rocketMQTemplate.convertAndSend(TOPIC, //主题
				om.writeValueAsString(champion) // 发送的消息，发送的消息最好是简单精确，如果是JSON格式最佳
				// 如果要处理幂等之类的问题 需要生成一个唯一key 使用redis或者数据库
				// 来报保证消息的多次执行，生效一次，或者多次消息只执行一次的模式
		);
	}

}
