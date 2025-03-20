package com.pang.tiger.biz01.web.clouddemo001web.controller.out;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author pang
 */
@Slf4j
@RestController
public class TraceController {

    private final ExecutorService executorService = Executors.newFixedThreadPool(100);


    // private final RocketMQTemplate rocketMQTemplate;

//    public TraceController(RocketMQTemplate rocketMQTemplate) {
//        this.rocketMQTemplate = rocketMQTemplate;
//    }

    @RequestMapping("/trace1")
    public String trace() {
        log.info("trace1");
        log.info("trace2");
        log.info("trace3");
        // 提交 1000 个任务到线程池
//        for (int i = 0; i < 100; i++) {
//            executorService.submit(() -> {
//                try {
//                    rocketMQTemplate.syncSend("test-topic", "trace");
//                    log.info("Message sent successfully");
//                } catch (Exception e) {
//                    log.error("Failed to send message", e);
//                }
//            });
//        }
        log.info("trace4");
        return "trace";
    }
}
