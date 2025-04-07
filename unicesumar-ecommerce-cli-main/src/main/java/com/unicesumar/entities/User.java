package com.unicesumar.entities;

import java.util.UUID;

public class User extends Entity {
    private String name;
    private String email;
    private String password;

    public User(UUID uuid, String name, String email, String password) {
        super(uuid);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + getUuid() + // Use inherited getUuid()
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                // Avoid printing password directly in production logs
                ", password='********'" +
                '}';
    }
}