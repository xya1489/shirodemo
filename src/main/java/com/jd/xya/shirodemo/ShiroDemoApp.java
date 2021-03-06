package com.jd.xya.shirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
@Controller
@SpringBootApplication
@MapperScan("com.jd.xya.shirodemo.mapper")  //mybatis 扫描包
public class ShiroDemoApp {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ShiroDemoApp.class, args);
    }
}
