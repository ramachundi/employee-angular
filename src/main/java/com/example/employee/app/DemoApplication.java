package com.example.employee.app;

import javax.annotation.PostConstruct;

import com.example.employee.entity.User;
import com.example.employee.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.example" })
@EntityScan("com.example")
@SpringBootApplication(scanBasePackages = { "com.example" })
public class DemoApplication {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void setup() {
		// for testing
		User user = new User();
		user.setName("Rama chundi");
		user = userRepository.save(user);
	}
}
