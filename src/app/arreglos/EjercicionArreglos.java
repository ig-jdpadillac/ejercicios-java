package app.arreglos;

import java.util.Scanner;

public class EjercicionArreglos {

    private final int semestres = 6;
    private final int calificacionGeneral;
    private double calificaciones[] = new double[6];

    public static void main(String[] args) {

        EjercicionArreglos objeto = new EjercicionArreglos(70);
        objeto.solicitaCalificaciones();
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
        
    }

}