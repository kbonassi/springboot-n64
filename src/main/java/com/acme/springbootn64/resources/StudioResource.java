package com.acme.springbootn64.resources;

import com.acme.springbootn64.entities.Studio;
import com.acme.springbootn64.services.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/studios")
public class StudioResource {
    @Autowired
    private StudioService studioService;

    @GetMapping
    public ResponseEntity<List<Studio>> findAll() {
        List<Studio> list = studioService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Studio> findById(@PathVariable Long id) {
        Studio obj = studioService.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
