package com.example.GenerativeAI0203.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "directors")
public class Director {

    @Id
    private String id;
    private String name;

    // constructors
    public Director() {}

    public Director(String name) {
        this.name = name;
    }

    // getters and setters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
