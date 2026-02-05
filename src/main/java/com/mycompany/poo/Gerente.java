/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author busto
 */
public class Gerente extends Persona {
    
    private String departamento;

    public Gerente(String departamento, String nombre, String apellidos, int edad, Direccion direccion) {
        super(nombre, apellidos, edad, direccion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "en el departamento" + departamento;
    }
    
    @Override
    public double sueldo(){
        switch (this.departamento) {
            case "it":
                return 1900;
            case "contabilidad":
                return 1400;
            case "marketing":
                    return 1300;
            default:
                return 1000;
        }
        
    }
    
}
