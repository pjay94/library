package com.library.service;

import com.library.model.Genre;
import com.library.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreService {
    private GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    public List<Genre> getGenres(){
        return genreRepository.findAll();
    }

    public Genre addGenre(Genre genre){
        return genreRepository.save(genre);
    }

    @Transactional
    public void deleteGenre(String name){
        genreRepository.deleteByName(name);
    }

    @Transactional
    public void deleteGenre(Long id){
        genreRepository.deleteById(id);
    }

    public Genre updateGenre(Long id, Genre genreFromRequest){
        Genre genre = genreRepository.findById(id).orElseThrow(() -> new RuntimeException("Genre not found."));
        String name = genreFromRequest.getName();
        if(name != null) genre.setName(name);

        return genreRepository.save(genre);
    }
}

