package app.metodos;

public class Metodos {


    public static void main(String[] args) {
        
        Calificaciones califGrupo = new Calificaciones();

        Alumno alumnoUno = new Alumno(85, "Jonathan Padilla");
        Alumno alumnoDos = new Alumno(71, "Nelly Padilla");
        Alumno alumnoTres = new Alumno(91, "Rosa Padilla");

        Alumno.cuotaSemestral = 500;


        alumnoUno.monstrarInfoEstudainte();
        alumnoDos.monstrarInfoEstudainte();
        alumnoTres.monstrarInfoEstudainte();

        Alumno.Mmostrarcuotasemestral();


        double sumaCalificaciones  = califGrupo.sumaCalificaciones(alumnoUno);
        alumnoUno.monstrarInfoEstudainte();

        sumaCalificaciones = califGrupo.sumaCalificaciones(alumnoDos);
        alumnoDos.monstrarInfoEstudainte();

        sumaCalificaciones = califGrupo.sumaCalificaciones(alumnoTres);
        alumnoTres.monstrarInfoEstudainte();



        System.out.println("Suma de puntos del grupo: " +  sumaCalificaciones);
        double promedioGrupo = sumaCalificaciones / 3;

        System.out.println("El promedio del grupo es: " + promedioGrupo);

    }
}