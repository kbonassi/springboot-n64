package com.acme.springbootn64.resources;

import com.acme.springbootn64.entities.Genre;
import com.acme.springbootn64.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/genres")
public class GenreResource {
    @Autowired
    private GenreService genreService;

    @GetMapping
    public ResponseEntity<List<Genre>> findAll() {
        List<Genre> list = genreService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Genre> findById(@PathVariable Long id) {
        Genre obj = genreService.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
