package com.org.rich.REST.Api.repositories;

import com.org.rich.REST.Api.models.AutorModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AutorRepository extends CrudRepository<AutorModel, Long> {
    public abstract ArrayList<AutorModel> findByName(String name);
}
