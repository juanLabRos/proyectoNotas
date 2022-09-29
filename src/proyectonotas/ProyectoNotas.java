/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

import java.util.Scanner;

/**
 *
 * @author Alumnos Mañana
 */
public class ProyectoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);

//variable
System.out.println("Introduzca la nota del alumno: ");
         int nota = Integer.parseInt(lectura.nextLine());
        //Solicitar la nota por teclado
        System.out.println("La nota introducida es: "+nota);
        
        if(nota<0){
            System.out.println("ERROR---La nota debe de estar entre 0 y 10");
        }else if(nota>10){
            System.out.println("ERROR---La nota debe estar entre 0 y 10");
        }
        else if(nota==0 || nota<4){
            System.out.println("El alumno está suspenso");
            
        }else if (nota==5){
            System.out.println("El alumno está aprobado");
        }else if(nota==6){
            System.out.println("El alumno tiene un bien");
        }else if(nota==7 || nota==8){
            System.out.println("El alumno tien un notable");
        }else if (nota==9 || nota==10){
        System.out.println("El alumno tiene un sobresaliente");
  
    }
    }
}
