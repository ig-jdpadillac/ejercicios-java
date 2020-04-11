package app.metodos;

public class Calificaciones {

    public double totalCalificaciones = 0.0;

    public double sumaCalificaciones(Alumno a) {
        totalCalificaciones = totalCalificaciones + a.calificacion;
        return totalCalificaciones;
    }

}