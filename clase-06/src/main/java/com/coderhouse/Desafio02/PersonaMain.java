package com.coderhouse.Desafio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonaMain {

    public static void main(String[] args) {
        // Creo 5 objetos de persona 
        Persona persona1 = new Persona("Juan", "Pérez");
        Persona persona2 = new Persona("Ricardo", "Fort");
        Persona persona3 = new Persona("Mirtha", "Legrand");
        Persona persona4 = new Persona("Luciano", "Lopez");
        Persona persona5 = new Persona("Messi", "Lionel");
        System.out.println("Persona1: " + persona1 + "\n" +
                           "Persona2: " + persona2 + "\n" +
                           "Persona3: " + persona3 + "\n" +
                           "Persona4: " + persona4 + "\n" +
                           "Persona5: " + persona5);

        // Agrego los objetos a la lista
        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        // Ordeno alfabéticamente por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre)); //Utilizo el comparator para ordenar los nombres alfabeticamente con el sort.  
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {  //Utilice el foreach para recorrer la lista de cada Persona,y imprimo los nombres solamente, utilizando el metodo getNombre().
            System.out.println(persona.getNombre());
        }

        // Ordeno alfabéticamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido)); //Utilizo el comparator para ordenar alfabeticamente los apellidos con el sort. 
        System.out.println("Ordenado por apellido:");
        for (Persona persona : personas) {   //Utilice el foreach para recorrer la lista de cada Persona,y imprimo los apellidos solamente, utilizando el metodo getapelido()
        	System.out.println(persona.getApellido());
            
        }

        // Ordeno inversamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed()); //Utilizo el comparator para ordenar con el sort , y luego el reversed , ordena de forma reversa. 
        System.out.println("Ordenado inversamente por apellido:");
        for (Persona persona : personas) {
        System.out.println(persona.getApellido());
        }
    }


}