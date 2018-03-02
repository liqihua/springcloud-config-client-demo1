package com.liqihua;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestController {

    @Value("${aa.bb}")
    String bb;
    @Value("${cc.dd}")
    String dd;


    @RequestMapping("/test1")
    public String test1(){
        return bb+","+dd;
    }
}
