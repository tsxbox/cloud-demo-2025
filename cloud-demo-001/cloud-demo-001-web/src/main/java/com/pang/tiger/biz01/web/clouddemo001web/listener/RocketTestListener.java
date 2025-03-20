//package com.pang.tiger.biz01.web.clouddemo001web.listener;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.spring.annotation.ConsumeMode;
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.springframework.stereotype.Component;
//
///**
// * @ClassName RocketTestListener
// * @Description TODO
// * @Author Tang Shixin
// */
//@Component
//@RocketMQMessageListener(topic = "test-topic", consumerGroup = "test-group", selectorExpression = "*",
//consumeMode = ConsumeMode.CONCURRENTLY)
//@Slf4j
//public class RocketTestListener implements RocketMQListener<String> {
//
//    @Override
//    public void onMessage(String message) {
//        log.info("receive message: {}", message);
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
