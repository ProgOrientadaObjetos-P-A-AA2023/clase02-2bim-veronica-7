/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        
        String nombre = "Pedro";
        String apellido = "Paredes";
        String identificacion = "128003";
        int edad = 24;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(8);
        estPresencial.establecerCostoCredito(25.40);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
