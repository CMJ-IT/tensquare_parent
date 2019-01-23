package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/*启动类：基础微服务*/
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }

    /*初始化IdWork*/
    @Bean   /**默认是单例*/
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
