package app;

import app.poo.Persona;

// [Modificador] tipo identificador ['valor']
public class App {

    // Tipo de datos char o string
    char miCaracter = 'a';

    // Tipo de dato Byte
    byte myByteMin = -128;
    byte myByteMax = 127;

    // Tipo de dato short
    short myShortMin = -32768;
    short myShortMax = 32767;

    // Tipo de dato int
    int myInttMin = -2147483648;
    int myIntMax = 2147483647;


    // Tipo de dato float

    float myFloat = 10;
    double myDouble = 10;

    public static void main(String[] args) {
        // App ejem = new App();
        // ejem.imprimirElementos();
        // ejem.imprimirFloat();

        // Cambiando y asignando informacion deobjetos
        Persona p1 = new Persona("Juan", "Padilla", 22, "Masculino");
        System.out.println(p1.regresarApellido());
        p1.asignarApellido("Otro apellido distinto");
        System.out.println(p1.regresarApellido());


        // Clase String

        
        String var1 = "Hola";
        String var2 = "Hola";
        String var3 = new String("Hola");


    }

    public void imprimirElementos() {
        System.out.println("Hola, Pendejos" + myIntMax);
    }


    public void imprimirFloat() {
        System.out.println("Este es my valor con punto flotante " + myFloat);
    }

}