/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacion;

import java.util.Scanner;
import static validacion.Validacion.validarA;
import static validacion.Validacion.validarNoNum;

/**
 *
 * @author carlosab
 */
public class alumnos {
    public static void main(String[] args) {
        String[] nombreAlumnos=new String[15];
        double[] notaAlumnos=new double[15];
        double notamedia=0;
        boolean seguir;
        String campo;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nombreAlumnos.length;i++){
            seguir=false;
            do{
                System.out.println("Introduce el nombre del alumno:");
                campo=sc.nextLine();
                seguir=validarNoNum(campo);
                if(!seguir) System.out.println("Entrada incorrecta");
            }while(seguir==false);
            nombreAlumnos[i]=campo;
            do{
                System.out.println("Introduce la nota del alumno:");
                campo=sc.nextLine();
                seguir=validarA(campo);
                if(!seguir) System.out.println("Entrada incorrecta");
            }while(seguir==false);
            notaAlumnos[i]=Double.parseDouble(campo);
            notamedia+=notaAlumnos[i];
        }
        notamedia/=15;
        System.out.println("nota media : "+notamedia);
        System.out.println("alumnos con nota igual o mayor a la media:");
        for (int i=0;i<notaAlumnos.length;i++){
            if (notaAlumnos[i]>=notamedia) System.out.println(nombreAlumnos[i]+" : "+notaAlumnos[i]);
        }
        
    }
    
}
