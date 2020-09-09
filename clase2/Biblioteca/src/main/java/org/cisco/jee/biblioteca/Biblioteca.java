/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cisco.jee.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Biblioteca {
    
    List<Object> libros;
    
    public Biblioteca(){
        libros = new ArrayList<>();
               
    }
    public void addLibro(Object libro){
        libros.add(libro);
    }
    
    
    public static void main(String[] args) {
        System.out.println("Biblioteca");
    }
    
    
}
