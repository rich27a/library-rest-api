package com.org.rich.REST.Api.services;

import com.org.rich.REST.Api.models.LibroModel;
import com.org.rich.REST.Api.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public ArrayList<LibroModel> getBooks(){
        return (ArrayList<LibroModel>) libroRepository.findAll();
    }
    public LibroModel saveBook(LibroModel book){
        return libroRepository.save(book);
    }
    public Optional<LibroModel> findById(Long id){
        return libroRepository.findById(id);
    }
    public boolean deleteBook(Long id){
        try {
            libroRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
