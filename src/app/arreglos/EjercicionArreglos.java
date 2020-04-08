package app.arreglos;

import java.util.Scanner;

public class EjercicionArreglos {

    private final int bumestres = 6;
    private final int calificacionGeneral;
    private double calificaciones[] = new double[6];

    public static void main(String[] args) {

        EjercicionArreglos objeto = new EjercicionArreglos(70);
        objeto.solicitaCalificaciones();
        objeto.imprimeCalificacionBimestre();
        System.out.println("Y su promedio es de " + objeto.calcularPromedio());
    }

    public EjercicionArreglos(int calificacionGeneralparam) {
        calificacionGeneral = calificacionGeneralparam;
    }

    public void solicitaCalificaciones() {
        
        Scanner entrada = new Scanner(System.in);

        double calificacion;

        for (int i = 0; i < calificaciones.length; i++) {

            System.out.println(("Calificación para el bimestr " + (i + 1)));
            calificacion = entrada.nextDouble();
            calificaciones[i] = calificacion;
        }
    }

    public void imprimeCalificacionBimestre() {
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] < calificacionGeneral) {
                System.out.println("Con un " + calificaciones[i] + " Repruebas el bimestre");
            } else {
                System.out.println("Con un " + calificaciones[i] + " Apruebas el bimentre");
            }
        }
    }


    public double calcularPromedio() {
        double suma = 0;

        for (double calificacion: calificaciones) {
            suma += calificacion;
        }

        suma = suma / bumestres;

        return suma;
    }

}