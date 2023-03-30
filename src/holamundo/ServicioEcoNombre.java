package holamundo;

import java.util.Scanner;

public class ServicioEcoNombre {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe tu nombre con apellidos:");
        String nombreApellidos = consola.nextLine();
        
        System.out.println("Escribe dni:");
        String dni = consola.nextLine();         
               
        System.out.println("Escribe precioMatricula:");
        double precioMatricula = Double.parseDouble(consola.nextLine());
        
        System.out.println("Es clase virtual");
        boolean claseVirtual = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("nombreApellidos = " + nombreApellidos);
        System.out.println("dni = " + dni);
        System.out.println("precioMatricula = " + precioMatricula);
        System.out.println("claseVirtual = " + claseVirtual);                            
    }    
}
