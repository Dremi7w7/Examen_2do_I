/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author Dremi7w7
 */
public class CategoriaServicio implements ICategoriaServicio {
        private final List<Categoria> categoriaList = new ArrayList<>();

    @Override
    public Categoria crear(Categoria categoria) {
        this.categoriaList.add(categoria);
        return categoria;
    }

    @Override
    public List<Categoria> listar() {
        return this.categoriaList;
    }
}
