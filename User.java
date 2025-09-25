package com.elevatelabs.tasks.task3;

public class User {
    private int id;
    private String name;

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // For displaying user details
    @Override
    public String toString() {
        return "User [ID=" + id + ", Name=" + name + "]";
    }
}
