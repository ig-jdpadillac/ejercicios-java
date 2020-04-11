package app.metodos;

public class Alumno {

    int calificacion;
    String nombre;

    public static double cuotaSemestral;

    public Alumno (int cal, String nomb) {
        calificacion = cal;
        nombre = nomb;
    }

    public Alumno() {
        
    }

    public void monstrarInfoEstudainte() {
        System.out.print("Nombre " + nombre);
        System.out.println("   Calificacion " + calificacion);

    }

    public static void Mmostrarcuotasemestral() {
        System.out.println("La cuota semestral es de: " + cuotaSemestral);
    }

}