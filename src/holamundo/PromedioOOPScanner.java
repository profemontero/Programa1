package holamundo;

import java.util.Scanner;

public class PromedioOOPScanner {

    public PromedioOOPScanner() { //Constructor

    }

    public double pedirCalificacion() {

        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe la calificación : ");
        double calif = Double.parseDouble(consola.nextLine());
        return calif;
    }

    public double sumarCalificaciones(double calif1, double calif2,double calif3) {

        double suma = calif1 + calif2 + calif3;
        return suma;
    }

    public double calcularPromedio(double suma) {
        

        double promedio = suma / 3;
        return promedio;
    }

    public static void main(String[] args) {

        PromedioOOPScanner instanciaPromedio = new PromedioOOPScanner();
        double calif1 = instanciaPromedio.pedirCalificacion();
        double calif2 = instanciaPromedio.pedirCalificacion();
        double calif3 = instanciaPromedio.pedirCalificacion();
        double suma = instanciaPromedio.sumarCalificaciones(calif1, calif2, calif3);
        System.out.println("El promedio es: "+ instanciaPromedio.calcularPromedio(suma));

    }
}
