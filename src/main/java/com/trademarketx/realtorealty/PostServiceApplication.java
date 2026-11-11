package com.trademarketx.realtorealty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = { "com.trademarketx" })
public class PostServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PostServiceApplication.class, args);
	}
}
