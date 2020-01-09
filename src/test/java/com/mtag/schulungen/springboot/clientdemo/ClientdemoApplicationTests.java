package com.mtag.schulungen.springboot.clientdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;

@SpringBootTest
class ClientdemoApplicationTests {

    JacksonTester<Tankvorgang> tankvorgang;

    @Test
    void contextLoads() {
    }

}
