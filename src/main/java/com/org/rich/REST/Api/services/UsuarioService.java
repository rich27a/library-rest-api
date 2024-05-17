package com.org.rich.REST.Api.services;

import com.org.rich.REST.Api.models.UsuarioModel;
import com.org.rich.REST.Api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsers(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel saveUser(UsuarioModel user){
        return usuarioRepository.save(user);
    }

    public Optional<UsuarioModel> findById(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> getByName(String name){
        return usuarioRepository.findByName(name);
    }

    public boolean deleteUser(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
