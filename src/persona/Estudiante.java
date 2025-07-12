/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author JOYA-
 */
public class Estudiante extends Persona {
    
    private String nombre;
    
    public Estudiante(String nombre, int edad){
        super(nombre, edad);
    }
    
    
    @Override
    public void saludar(){
        System.out.println("Hola, le saluda: " + nombre);
    }

}
