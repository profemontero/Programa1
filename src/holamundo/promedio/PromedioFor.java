
package holamundo;

import java.util.Scanner;

public class PromedioFor {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
              
        double calif=0;
        double suma=0;
        for(int i=1; i<=3; i++){
            System.out.println("Escribe la calificación "+i+": ");
            calif = Double.parseDouble(consola.nextLine());
            suma =calif+suma;        
        }            
                
        double promedio=suma/3;
        
        System.out.println("El promedio es: " + promedio); 
    }
}
