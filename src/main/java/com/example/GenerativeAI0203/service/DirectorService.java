package com.example.GenerativeAI0203.service;

import com.example.GenerativeAI0203.domain.Director;
import com.example.GenerativeAI0203.repositories.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Director getDirectorById(String id) {
        return directorRepository.findById(id).orElse(null);
    }

    public Director createDirector(Director director) {
        return directorRepository.save(director);
    }

    public void deleteDirector(String id) {
        directorRepository.deleteById(id);
    }

    public Director updateDirector(Director director) {
        return directorRepository.save(director);
    }
}
