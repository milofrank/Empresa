/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author milof
 */
public class Vector {
    public Empleado listEmple[];
    
   public Vector(){
        int tam =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        listEmple = new Empleado[tam];
        for (int i = 0; i < listEmple.length; i++) {
            listEmple[i]= new Empleado(-1,"","",-1,-1,-1);
            
        }
    }
    
    public void Mostrar(){
        
    }
    
}
