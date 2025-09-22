package com.entity;

public class Book {
    private int id;
    private String name;
    private String owner;
    private String description;

    public Book() {}

    public Book(int id, String name, String owner, String description) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.description = description;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
