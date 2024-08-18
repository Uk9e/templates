//package com.ith2.modules.msgtest.consumer;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//@RocketMQMessageListener(topic = "test_topic", consumerGroup = "notice")
//public class DemoConsumer implements RocketMQListener<String> {
//	@Override
//	public void onMessage(String msg) {
//		log.info("received message: {}", msg);
//		System.err.println(msg);
//	}
//}
