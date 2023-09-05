/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class PrimeraClase {
    String unaCadena;
    int unEntero;
    public void mostrar (){
        System.out.println("Atributos: " + unaCadena + " y " + unEntero);      
    }
    
    public static void main(String[] args) {
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Escritorio";
        unObjeto2.unEntero = 6;
        unObjeto3.unaCadena = "pc";
        unObjeto3.unEntero = 7;
        unObjeto4.unaCadena = "hola";
        unObjeto4.unEntero = 8;
        unObjeto5.unaCadena = "chao";
        unObjeto5.unEntero = 9;
        ArrayList<PrimeraClase> guardar  = new ArrayList<>();
        guardar.add(unObjeto1);
        guardar.add(unObjeto2);
        guardar.add(unObjeto3);
        guardar.add(unObjeto4);
        guardar.add(unObjeto5);
        for (int i = 0; i < guardar.size(); i++) {
            int get = guardar.get(i).unEntero;
            String cadena = guardar.get(i).unaCadena;
            System.out.println("ArrayList " + i + ": " + get);
            System.out.println("ArrayList " + i + ": " + cadena);
        }
    }
    
}
