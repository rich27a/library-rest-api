package com.org.rich.REST.Api.services;

import com.org.rich.REST.Api.models.CategoriaModel;
import com.org.rich.REST.Api.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public ArrayList<CategoriaModel> getCategories(){
        return (ArrayList<CategoriaModel>) categoriaRepository.findAll();
    }

    public CategoriaModel saveCategorie(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }

    public Optional<CategoriaModel> findById(Long id){
        return categoriaRepository.findById(id);
    }

    public boolean deleteCategorie(Long id){
        try {
            categoriaRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
