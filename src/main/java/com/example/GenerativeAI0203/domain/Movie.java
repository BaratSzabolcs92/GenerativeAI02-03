package com.example.GenerativeAI0203.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Document(collection = "movies")
public class Movie {

    @Id
    private String id;
    private String title;
    private String releaseDate;
    private int runtime;
    private List<String> actors;
    private List<String> directors;

    // constructors
    public Movie() {}

    public Movie(String title, String releaseDate,
                 int runtime, List<String> actors, List<String> directors) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.actors = actors;
        this.directors = directors;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRuntime() {
        return runtime;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }
}
