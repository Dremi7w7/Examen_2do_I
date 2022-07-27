/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

/**
 *
 * @author Dremi7w7
 */
public class LibroServicio implements ILibroServicio {
        private final List<Libro> libroList = new ArrayList<>();

        
       
    @Override
    public Libro crear(Libro libro) {
        this.libroList.add(libro);
        return libro;
    }

    @Override
    public List<Libro> listar() {
        return this.libroList;
    }
}
