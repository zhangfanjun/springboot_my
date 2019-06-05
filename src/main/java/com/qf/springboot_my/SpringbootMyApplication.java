package com.qf.springboot_my;

import com.qf.springboot_my.entity.DUser;
import com.qf.springboot_my.mapper.DUserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.springboot_my.mapper")
public class SpringbootMyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyApplication.class, args);


    }

}
