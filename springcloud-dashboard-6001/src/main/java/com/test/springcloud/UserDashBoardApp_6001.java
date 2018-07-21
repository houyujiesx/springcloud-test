package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class UserDashBoardApp_6001 {

	public static void main(String[] args) {
		SpringApplication.run(UserDashBoardApp_6001.class, args);
	}
}
