package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program sell
 * @description: 日志测试
 * @author: huangxinhe
 * @create: 2019/09/01 17:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class LoggerTest {
    @Test
    public void test1(){
        log.debug("debug...");
        log.info("info....");
        log.error("error...");
        log.warn("warn...");
    }
}
