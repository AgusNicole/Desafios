package com.coderhouse.Desafio02;

public class Persona extends PersonaMain{
 //Encapsulamiento
	private String nombre ; 
	private String apellido;
	
	
	public Persona(String nombre, String apellido ) { //Creo constructor para instanciar nombre y apellido por parametros en el main 
	        this.nombre = nombre;
	        this.apellido = apellido; 
	       
	 }

		
	public Persona() {
		
	//Creo un constructor vacio 
	}	
	


	//Getters y Setters 
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	//Polimorfismo 
@Override
	 public String toString() {
        return 
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
	}
	
 

		
	
}
	
	

