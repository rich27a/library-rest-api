package com.org.rich.REST.Api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class LibroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "authorId")
    AutorModel autor;

    @ManyToOne
    @JoinColumn(name = "categorieId")
    CategoriaModel categorie;

}
