package holamundo;
//clase que hará uso de atributos y métodos para calcularPromedio

public class PromedioOOP {

    double calif1;
    double calif2;
    double calif3;

    public PromedioOOP(double calificacion1, double calificacion2, double calificacion3) { //Constructor
        calif1 = calificacion1;
        calif2 = calificacion2;
        calif3 = calificacion3;
    }

    public double sumarCalificaciones() {
        double suma = calif1 + calif2 + calif3;
        return suma;
    }

    public double calcularPromedio() {
        double suma = this.sumarCalificaciones();
        double promedio = suma / 3;
        return promedio;
    }

    public static void main(String[] args) {

        PromedioOOP instanciaPromedio = new PromedioOOP(9, 8, 7);
        double promedio = instanciaPromedio.calcularPromedio();
        System.out.println("promedio = " + promedio);

    }
}
