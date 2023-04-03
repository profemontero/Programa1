//Escriba un programa que le pida al usuario dos números. 
package holamundo;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        
        int valorNumero1 = Integer.parseInt(consola.nextLine());    
        //tranforma una cadena introducida por el usuario a un número entero
        
        System.out.println("Escribe otro número: ");
        
        int valorNumero2 = Integer.parseInt(consola.nextLine());
        
        int suma = valorNumero1 + valorNumero2;
        
        System.out.println("La suma es: " + suma);               
    }
}
