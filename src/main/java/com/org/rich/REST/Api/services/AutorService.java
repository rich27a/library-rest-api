package com.org.rich.REST.Api.services;

import com.org.rich.REST.Api.models.AutorModel;
import com.org.rich.REST.Api.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public ArrayList<AutorModel> getAutors(){
        return (ArrayList<AutorModel>) autorRepository.findAll();
    }

    public AutorModel saveAutor(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public Optional<AutorModel> findById(Long id){
        return autorRepository.findById(id);
    }
    public ArrayList<AutorModel> getByName(String name){
        return autorRepository.findByName(name);
    }
    public boolean deleteAutor(Long id){
        try {
            autorRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
