package holamundo;

import java.util.Scanner;

public class PromedioProgEstructurada {

    public static void main(String[] args) {
        double suma;
        double calif1 = pedirDatos();
        double calif2 = pedirDatos();
        double calif3 = pedirDatos();
        double promedio = calcularPromedio(calif1, calif2, calif3);
        System.out.println("calif = " + promedio);
//        calcularPromedio(suma);
    }

    public static double pedirDatos() {

        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe la calificación ");
        double calif = Double.parseDouble(consola.nextLine());
        return calif;
    }

    public static double calcularPromedio(double calif1, double calif2, double calif3) {
        double suma = calif1 + calif2 + calif3;
        double promedio = suma / 3;
        return promedio;
    }
}
