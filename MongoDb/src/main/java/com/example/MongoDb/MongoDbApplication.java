package com.example.MongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.MongoDb.repository.UserRepository;

@SpringBootApplication
public class MongoDbApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}
	
	public void run(String...strings) throws Exception {
		System.out.println(userRepository.findAll());
	}

}
