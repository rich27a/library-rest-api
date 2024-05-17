package com.org.rich.REST.Api.controllers;

import com.org.rich.REST.Api.models.UsuarioModel;
import com.org.rich.REST.Api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> getUsers(){
        return this.usuarioService.getUsers();
    }

    @PostMapping()
    public UsuarioModel saveUser(@RequestBody UsuarioModel user){
        return this.usuarioService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getUserById(@PathVariable("id") Long id){
        return this.usuarioService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> getUsersByName(@RequestParam("name") String name){
        return this.usuarioService.getByName(name);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.deleteUser(id);
        if(ok){
            return "User with id " + id + "has been deleted";
        }else {
            return "User with id " + id + "cannot be deleted";
        }
    }
}
