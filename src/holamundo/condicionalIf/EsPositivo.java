
package holamundo.condicionalIf;
import java.util.Scanner;

public class EsPositivo {    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Introduce un número: ");
        int numero = scan.nextInt();
        if(numero>0){
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo");
        }
    }  
}
