package com.codingTool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.codingTool.dao")
@SpringBootApplication
public class KaleidoscopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaleidoscopeApplication.class, args);
	}

}

