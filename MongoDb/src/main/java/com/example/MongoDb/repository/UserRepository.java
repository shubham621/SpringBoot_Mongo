package com.example.MongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MongoDb.entity.Users;

public interface UserRepository extends MongoRepository<Users, String> {

	Users findByusernameEquals(String Username);
}
