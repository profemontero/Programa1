
package holamundo;

import java.util.Scanner;


public class Promedio {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe la calificación 1: ");        
        double calif1 = Double.parseDouble(consola.nextLine());        
        
        System.out.println("Escribe la calificación 2: ");        
        double calif2 = Double.parseDouble(consola.nextLine());
        
        System.out.println("Escribe la calificación 3: ");        
        double calif3 = Double.parseDouble(consola.nextLine());
        
        double suma = calif1 + calif2 +calif3;        
        double promedio=suma/3;
        
        System.out.println("promedio = " + promedio);
        
        if(promedio >7)
            System.out.println("buen promedio");
        else
            System.out.println("esfuerzate más");
        
//        if(promedio<6){
//            System.out.println("El promedio es: " + promedio+ " que mal");  
//        }
//        else if(promedio==10){
//            System.out.println("El promedio es: " + promedio + "promedio excelente");
//        }
//        else if(promedio>8){
//            System.out.println("El promedio es: " + promedio + " buen promedio");
//        }
//        else if(promedio>=6){
//            System.out.println("El promedio es: " + promedio + " esfuerzate más");
//        }
                               
    }
}
