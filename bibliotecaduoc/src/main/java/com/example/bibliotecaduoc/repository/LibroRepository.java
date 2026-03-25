package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    //Arreglo que guarde todos los libros
    private List<Libro> listaLibros = new ArrayList<>();
    
}
