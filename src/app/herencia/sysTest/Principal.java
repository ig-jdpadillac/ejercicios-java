package app.herencia.sysTest;
import app.herencia.sysDomain.Alumno;
import app.herencia.sysDomain.Persona;

public class Principal {


    public static void main(String[] args) {
        
        Persona.setNombreEscuela("Escuela mk marino");
        Alumno alumnoUno = new Alumno(1000, "Jorge", 34, "Maculino");

        alumnoUno.mostrarInfoAlumno();
    }
}