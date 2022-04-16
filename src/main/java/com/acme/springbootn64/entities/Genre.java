package com.acme.springbootn64.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Genre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genre;
    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    private List<Game> games = new ArrayList<>();

    public Genre() {
    }

    public Genre(Long id, String genre) {
        this.id = id;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Game> getGames() { return games; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre1 = (Genre) o;
        return id.equals(genre1.id) && genre.equals(genre1.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
