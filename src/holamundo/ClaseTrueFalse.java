/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author gisne
 */
public class ClaseTrueFalse {
    
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe estado: ");
        
        boolean claseVirtual = Boolean.parseBoolean(consola.nextLine());    
        //tranforma una cadena introducida por el usuario a un número entero
        
        System.out.println("claseVirtual = " + claseVirtual);
    }
    
}
