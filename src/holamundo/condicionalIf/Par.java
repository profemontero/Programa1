package holamundo.condicionalIf;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();
        
        if(numero%2 == 0){
            System.out.println("numero "+numero+" es par!");
        } else {
            System.out.println("numero "+numero+" es impar!");
        }
    }
    
}