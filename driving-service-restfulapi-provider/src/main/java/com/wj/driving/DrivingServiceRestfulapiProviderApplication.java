package com.wj.driving;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wj.driving.restfulapi.domain.mapper")
public class DrivingServiceRestfulapiProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrivingServiceRestfulapiProviderApplication.class, args);
    }

}
