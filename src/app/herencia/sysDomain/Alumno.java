package app.herencia.sysDomain;

public class Alumno extends Persona{

    private int numeroAlumno;

    public Alumno() {}

    public Alumno(int nAlumno, String nombre, int edad, String sexo) {
        this.numeroAlumno = nAlumno;
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public void mostrarInfoAlumno() {
        System.out.println("-------------Informacion del alumno-------------");
        System.out.println("Escuela de estudiante: " + Persona.getNombreEscuela());
        System.out.println("Numero de alumno: " + this.getNumeroAlumno());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());

    }

    public int getNumeroAlumno() {
        return this.numeroAlumno;
    }

    public void setNumeroAlumno(int numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

}