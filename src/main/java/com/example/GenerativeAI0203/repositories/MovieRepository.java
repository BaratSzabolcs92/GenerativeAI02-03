package com.example.GenerativeAI0203.repositories;

import com.example.GenerativeAI0203.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {

    List<Movie> findByTitleContaining(String title);

    @Query("{'releaseDate' : {$regex : ?0}}")
    List<Movie> findByReleaseDate(String releaseDate);
}