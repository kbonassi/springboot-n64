package com.acme.springbootn64.repositories;

import com.acme.springbootn64.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
