package com.wyw.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(value = "com.wyw.druid.dao")  //扫描dao 包
@ServletComponentScan // 开启 servlet 扫描
public class DruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(DruidApplication.class, args);
		System.out.println("********************************");
		System.out.println("***********服务启动成功**********");
		System.out.println("********************************");
	}
}
