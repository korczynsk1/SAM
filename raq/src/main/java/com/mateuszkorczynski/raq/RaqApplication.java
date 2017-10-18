package com.mateuszkorczynski.raq;

import com.mateuszkorczynski.raq.model.User;
import com.mateuszkorczynski.raq.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RaqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaqApplication.class, args);
	}

}
