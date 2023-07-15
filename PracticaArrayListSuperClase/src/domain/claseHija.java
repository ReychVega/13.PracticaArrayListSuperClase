/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author reych
 */
public class claseHija extends superClase{
    private int edad;

    public claseHija() {
        String s="";
        s.trim();
    }

    public claseHija(String nombre, int edad) {
        super(nombre);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+"Edad=" + edad + '}';
    }
    
    
    
}
