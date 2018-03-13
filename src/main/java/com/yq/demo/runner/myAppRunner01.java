package com.yq.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class myAppRunner01 implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(myAppRunner01.class);

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        String[] args = arg0.getSourceArgs();
        String string = String.join(",", args);
        log.info("my second apprunner. order is 1. AppArgs:" + string);
    }

}
