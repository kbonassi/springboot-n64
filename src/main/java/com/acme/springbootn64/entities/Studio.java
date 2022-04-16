package com.acme.springbootn64.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Studio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String developer;
    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    private List<Game> games = new ArrayList<>();

    public Studio() {
    }

    public Studio(Long id, String developer) {
        this.id = id;
        this.developer = developer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public List<Game> getGames() { return games; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studio studio = (Studio) o;
        return id.equals(studio.id) && Objects.equals(developer, studio.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, developer);
    }
}
