package com.care.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//SecurityAutoConfiguration.class를 exclude 속성에 포함시킨다면, Spring Security의 자동 구성을 비활성화할 수 있습니다.
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BootApplication {
	// http://localhost/logout
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
