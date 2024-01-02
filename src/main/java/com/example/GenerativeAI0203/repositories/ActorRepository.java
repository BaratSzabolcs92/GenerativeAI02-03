package com.example.GenerativeAI0203.repositories;

import com.example.GenerativeAI0203.domain.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActorRepository extends MongoRepository<Actor, String> {

    Actor findByName(String name);
}
