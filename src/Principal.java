
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal {
    public static void main(String[] args) {
        int unEntero = 5;
        float flotante = 5.6f;
        double d = 'A';
        String nombre = "hola";
        float suma = 0;
        System.out.println("Variable int:" + unEntero);
        System.out.println("Variable float:" + flotante);
        System.out.println("Variable double:" + d);
        System.out.println("Variable cadena:" + nombre);
        ArrayList<Float> nmbre = new ArrayList<>();
        for (int i = 0; i < 5;i++) {
            nmbre.add(flotante);
        }
        for (int i = 0; i < nmbre.size(); i++) {
            Float get = nmbre.get(i);
            System.out.println("ArrayList " + i + ": " + get);
            suma = suma + get;
        }
        suma = suma / 5;
        System.out.println("promedio: " + suma);
    }
}
