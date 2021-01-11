package com.Feedback.Feedback;

import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackApplication.class, args);
		
		Configuration cfg=new Configuration();    
		cfg.configure("hibernate.cfg.xml"); 
	}

}
