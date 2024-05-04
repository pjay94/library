package com.library.controller;

import com.library.model.Genre;
import com.library.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {
    private GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService){
        this.genreService = genreService;
    }

    @GetMapping
    public List<Genre> getGenres(){
        return genreService.getGenres();
    }

    @PostMapping
    public Genre addGenre(@RequestBody Genre genre){
        return genreService.addGenre(genre);
    }

    @DeleteMapping
    public void deleteGenre(@RequestParam(name = "name") String name){
        genreService.deleteGenre(name);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable Long id){
        genreService.deleteGenre(id);
    }

    @PutMapping("/{id}")
    public Genre updateGenre(@PathVariable Long id, @RequestBody Genre genre){
        return genreService.updateGenre(id, genre);
    }
}
