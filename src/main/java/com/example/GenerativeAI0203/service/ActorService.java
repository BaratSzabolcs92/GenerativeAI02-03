package com.example.GenerativeAI0203.service;
import com.example.GenerativeAI0203.domain.Actor;
import com.example.GenerativeAI0203.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor getActorById(String id) {
        return actorRepository.findById(id).orElse(null);
    }

    public Actor createActor(Actor actor) {
        return actorRepository.save(actor);
    }

    public void deleteActor(String id) {
        actorRepository.deleteById(id);
    }

    public Actor updateActor(Actor actor) {
        return actorRepository.save(actor);
    }
}
