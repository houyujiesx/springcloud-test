package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.test.springcloud"})
@ComponentScan("com.test.springcloud")
public class UserConsumerApp_80 {

	public static void main(String[] args) {
		SpringApplication.run(UserConsumerApp_80.class, args);
	}
}
