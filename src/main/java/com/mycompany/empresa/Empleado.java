/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author milof
 */
public class Empleado {
    int id;
    String nom;
    String genero;
    float salario;
    int estrato;
    float horasE;
    
    
    
    public Empleado(int id, String nom, String gen, float salbas, int stro, float horasE){
        this.id= id;
        this.nom=nom;
        genero = gen;
        salario=salbas;
        estrato = stro;
        this.horasE=horasE;
    }
    
}
