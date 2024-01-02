package com.example.GenerativeAI0203.repositories;

import com.example.GenerativeAI0203.domain.Director;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DirectorRepository extends MongoRepository<Director, String> {

    Director findByName(String name);
}
