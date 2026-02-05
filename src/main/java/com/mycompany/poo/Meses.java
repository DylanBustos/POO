/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author busto
 */

// Creamos un enun 

public enum Meses {
    
    //Opciones y sus resultados como (parametros)
    ENERO (31),
    FEBRERO (28),
    MARZO (31),
    ABRIL (30),
    MAYO (31),
    JUNIO (30),
    JULIO (31),
    AGOSTO (31),
    SEPTIEMBRE (30),
    OCTUBRE (31),
    NOVIEMBRE (30),
    DICIEMBRE (31);
    
    //Definimos el atributo dias
    
    private  int dias;
    
    
    
    private Meses (int dias){
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    
    
    
}
