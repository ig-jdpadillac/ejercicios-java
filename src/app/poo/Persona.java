package app.poo;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String genero;


    public Persona(String nombreP, String apellidoP, int edadP, String generoP) {
        nombre = nombreP;
        apellido = apellidoP;
        edad = edadP;
        genero = generoP;
    }

    public void asignarNombre(String nombreP) {
        nombre = nombreP;
    }

    public String regresaNombre() {
        return nombre;
    }

    public void asignarApellido(String apellidoP) {
        apellido = apellidoP;
    }

    public String regresarApellido() {
        return apellido;
    }

    public void asignarEdad(int edadP) {
        edad = edadP;
    }

    public int regresarEdad() {
        return edad;
    }

    public void asignarGenero(String generoP) {
        genero = generoP;
    }

    public String regresarGenero() {
        return genero;
    }

}