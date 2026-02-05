/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author busto
 */
public class POO {

    public static void main(String[] args) {
        
        System.out.println(Persona.obtenerPersonas());
        
         // Instancio dos objetos de la clase persona
         
         Direccion direccion = new Direccion("Las fuentes", 12, "Coyol", "Las fuentes");
        Persona persona1 = new Persona("Fernando", "Ureña Gomez", 34, direccion);
        Persona persona2 = new Persona("Fernando", "Ureña Gomez", 15, direccion);

        System.out.println(persona1);
        
        // Comparo si son iguales
        if (persona1.equals(persona2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        for (Meses mes : Meses.values()){
            System.out.println("El mes " + mes.name() + " tiene " +  mes.getDias() + " dias");
        }
    
        Empleado emp1 = new Empleado(100, "Dylan", "Bustos Salas", 21, direccion);
        
        Gerente gerente = new Gerente("it", "Dylan", "Bustos Salas", 21, direccion);
        
        System.out.println(emp1.toString());
        
        System.out.println(emp1.sueldo());
        System.out.println(gerente.sueldo());
        System.out.println(persona1.sueldo());
        
    }
}
