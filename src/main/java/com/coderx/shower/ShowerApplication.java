package com.coderx.shower;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.coderx.shower.repository","com.coderx.shower.domain"})
public class ShowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowerApplication.class, args);
    }

}
