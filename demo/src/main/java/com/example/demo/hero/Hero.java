package com.example.demo.hero;

public class Hero {
    private Integer id;
    private String name;
    private String description;
    private String abilites;

    public Hero() {
    }

    public Hero(Integer id, String name, String description, String abilites) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.abilites = abilites;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbilites() {
        return abilites;
    }

    public void setAbilites(String abilites) {
        this.abilites = abilites;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", abilites='" + abilites + '\'' +
                '}';
    }
}
