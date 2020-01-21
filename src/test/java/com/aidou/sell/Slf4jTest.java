package com.aidou.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Slf4jTest {
    String name = "aidou";
    String password = "123456";
    @Test
    public void test(){
        log.debug("debug...");
        log.info("info...");

        /**
         * 变量输出推荐， 使用占位符
         * */
        log.info("name:{}, paddword:{}", name, password);
        log.error("error...");
    }
}
