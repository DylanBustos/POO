/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author busto
 */
public class Empleado extends Persona {
    
    private double salario;

    public Empleado(double salario, String nombre, String apellidos, int edad, Direccion direccion) {
        super(nombre, apellidos, edad, direccion);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "con salario: =" + salario;
    }
    
    @Override
    public double sueldo(){
        if (super.getEdad() >= 30){
            return this.salario + 500;
        }
        return this.salario;
    }
    
}
