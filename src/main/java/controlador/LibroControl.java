/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Libro;
import servicio.LibroServicio;

/**
 *
 * @author Dremi7w7
 */
public class LibroControl {
    
    private final LibroServicio libroServicio = new LibroServicio();
    
     public Libro crear(String [] params){
        var libro = new Libro(Integer.valueOf(params[0]),params[1],Integer.valueOf(params[2])); 
              
        this.libroServicio.crear(libro);
        return libro;
    }
     
        public List<Libro> listar(){
        return this.libroServicio.listar();
    }
    
    
}
