package com.testconnect.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    // springboot 自动适配所有的日志，而且低层使用的slf4j+logback的方式记录日志
    @Test
    public void loggerLoad() {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.debug("调试下的日志...");
        logger.info("日志xinxi...");
        logger.warn("警告..");
        logger.error("错误信息...");
        logger.trace("追溯信息...");
    }
}
