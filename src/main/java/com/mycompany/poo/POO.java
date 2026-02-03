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
        
         // Instancio dos objetos de la clase persona
        Persona persona1 = new Persona("Fernando", "Ureña Gomez", 34);
        Persona persona2 = new Persona("Fernando", "Ureña Gomez", 15);

        // Comparo si son iguales
        if (persona1.equals(persona2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }
}
