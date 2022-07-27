/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Categoria;

/**
 *
 * @author Dremi7w7
 */
public interface ICategoriaServicio {
    public Categoria crear(Categoria categoria);
    public List<Categoria> listar();  
}
