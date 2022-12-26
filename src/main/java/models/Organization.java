package models;


import models.UserNova;

public class Organization {
    private Long id;
    private String name;
    private UserNova usernova;

    public Organization(Long id, String name, UserNova usernova) {
        this.id = id;
        this.name = name;
        this.usernova = usernova;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserNova getUsernova() {
        return usernova;
    }

    public void setUsernova(UserNova usernova) {
        this.usernova = usernova;
    }
}