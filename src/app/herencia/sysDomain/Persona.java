package app.herencia.sysDomain;

public class Persona {


    private static String nombreEscuela;
    private int edad;
    private String nombre;
    private String sexo;

    public static String getNombreEscuela() {
        return nombreEscuela;
    }

    public static void setNombreEscuela(String nombreEscuelaP) {
        nombreEscuela = nombreEscuelaP;
    }



    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    

}