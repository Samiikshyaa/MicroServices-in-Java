package com.bway.servicec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceCApplicationTests {

    @Test
    public void checkSum(){
        Assertions.assertEquals(30, (20+10));
    }

    @Test
    public void checkAnswer(){
        Assertions.assertEquals(90, (20+70),"success");
    }

}
