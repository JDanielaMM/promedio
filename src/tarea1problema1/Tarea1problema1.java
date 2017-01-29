/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1problema1;
import java.util.Scanner;

/**
 *
 * @author danii
 */
public class Tarea1problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner key = new Scanner (System.in);
    
    String res;
    int mat;
    double cal1, cal2, cal3, cal4, cal5, pro;
        System.out.println("Teclea tu matricula: ");
        mat = key.nextInt();
        System.out.println("Teclea la calificación de la primera materia: ");
        cal1 = key.nextDouble();
        System.out.println("Teclea la calificación de la segunda materia: ");
        cal2 = key.nextDouble();
        System.out.println("Teclea la calificación de la tercera materia: ");
        cal3 = key.nextDouble();
        System.out.println("Teclea la calificación de la cuarta materia: ");
        cal4 = key.nextDouble();
        System.out.println("Teclea la calificación de la quinta materia: ");
        cal5 = key.nextDouble();
        
        pro = (cal1+cal2+cal3+cal4+cal5)/5;
        
        if (pro>=7)
        {
            res= "Aprobado";
            System.out.println("Alumno: "+ mat);
            System.out.println("Promedio: "+ pro);
            System.out.println("Estado: "+ res);
            
        }
        
        else
        {
            res="Reprobado";
            System.out.println("Alumno: "+ mat);
            System.out.println("Promedio: "+ pro);
            System.out.println("Estado: "+res);
             
        }
    }
    
}
