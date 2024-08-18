package com.ith2.modules;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ith2.*.*.mapper", "com.ith2.*.mapper", "com.ith2.modules.*.mapper"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
