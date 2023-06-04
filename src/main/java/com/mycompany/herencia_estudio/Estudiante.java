/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_estudio;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class Estudiante extends Persona {
    private  int codigoEstudiante;
    private  float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

   public void mostrarDatos(){
       System.out.println("Nombre : "+getNombre()+
       "\nApellido : " +getApellido()+
       "\nEdad : "+getEdad()+
       "\nCodigo estudiante : "+codigoEstudiante+
       "\nNota Final : "+notaFinal);
       
   }

    
   

    
    
    
    
    
    
    
    
}
