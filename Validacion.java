/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacion;

import java.util.Scanner;

/**
 *
 * @author carlosab
 */
public class Validacion {

    /**
     * @param args the command line arguments
     */
    public static boolean validarT(String cadena){
        try{
                int edad=Integer.parseInt(cadena);
                System.out.println("Dato introducido correctamente");
                return true;
             }catch(Exception e){
                 System.out.println("Dato introducido incorrectamente, un telefono no puede contener letras");
                 return false;}
    }
    
    public static boolean validarE(String cadena){
        try{
                int edad=Integer.parseInt(cadena);
                if (!(edad>0 && edad<=130)){System.out.println("La edad debe de estar entre 0 y 130");
                    return false;
                }
                System.out.println("Dato introducido correctamente");
                return true;
             }catch(Exception e){
                 System.out.println("Dato introducido incorrectamente, edad debe ser un entero");
                 return false;}
    }
    
     public static boolean validarA(String cadena){
        try{
                cadena=cadena.replace(",", ".");   
                double altura=Double.parseDouble(cadena);
                System.out.println("Dato introducido correctamente");
                return true;
             }catch(Exception e){
                 System.out.println("Dato introducido incorrectamente, edad debe ser un entero");
                 return false;}
    }
     
    public static boolean validarNoNum(String cadena){
        try{
            for(int i=0;i<cadena.length();i++){
                if(cadena.charAt(i)<=64 &&cadena.charAt(i)>=33) throw new ExcepcionInventada();
            }
            return true;
            }catch( ExcepcionInventada e){
                 System.out.println(e);
                 return false;}
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="";
        String edad="";
        String altura="";
        boolean seguir=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        do{
        
                nombre=sc.nextLine();
                seguir=validarNoNum(nombre);
        }while(seguir==false);
        
        System.out.println("Introduce tu edad");
        do{
        
                edad=sc.nextLine();
                seguir=validarE(edad);
        }while(seguir==false);
        System.out.println("Introduce tu altura:");
       do{
                altura=sc.nextLine();
                seguir=validarA(altura);
        }while(seguir==false);
        System.out.println(nombre+" "+edad+" "+altura);
        sc.close();
    }
    
}
