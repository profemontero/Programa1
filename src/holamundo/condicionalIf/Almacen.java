package holamundo.condicionalIf;

import java.util.Scanner;

public class Almacen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el total de la compra: ");
        double totalCompra = scan.nextInt();

        if (totalCompra > 100) {
            System.out.println("El total a pagar es: " + totalCompra * 0.8 + "€");
        } else {
            System.out.println("El total a pagar es: " + totalCompra + "€");
        }
    }

}
