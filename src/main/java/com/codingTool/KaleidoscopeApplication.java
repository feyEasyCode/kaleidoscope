package com.codingTool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.codingTool.dao"})
public class KaleidoscopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaleidoscopeApplication.class, args);
	}

}

