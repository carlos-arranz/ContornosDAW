/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validacion;

/**
 *
 * @author carlosab
 */
class ExcepcionInventada extends Exception {

    @Override
    public String toString() {
        return "ExcepcionInventada{Un nombre no puede contener numeros o caracteres especiales}";
    }
    
}
