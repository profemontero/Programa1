
package holamundo;

import java.util.Scanner;

public class ServicioEco {  
    
    public static void main(String[] args) {        
        
        //Lee la entrada del usuario y lo almacena en la variable scanner
        Scanner consola = new Scanner(System.in);

        // Solicita el mensaje
        System.out.println("Introduce un mensaje: ");

        //Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String mensaje = consola.nextLine(); //nextLine lee una linea completa

        // Imprime el mensaje introducido por el usuario
        System.out.println("Tu mensaje es: "+mensaje);
    }
}
   
