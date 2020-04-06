package app.OperadoresRelacionales;

public class Operadores {

    // Operadores relacionales
    // < menor que
    // > mayor que
    // <= menor o igual
    // >= mayor o igual
    // != Distinto
    // == Igual


    // Operadores logicos
    // && Operado and (y
    // || Operador or (o)
    // ! Operador not (no)
    // aqueals || equalsIgnoreCase __ para comparar Strings

    public static void main(String[] args) {
        
        Operadores opr = new Operadores();

        // opr.usoDeOperadoresRelacionales();
        opr.usoDeOperadoresLogicos();

    }


    public void usoDeOperadoresRelacionales() {
        int a = 7, b = 8, c = 7;

        if(a == b) {
            System.out.println("A es igual a B");
        }

        if(a >= c)
            System.out.println("A es mayor o igual a c");

        if(b < c)
            System.out.println("B es menor igual a c");  
    }

    public void usoDeOperadoresLogicos() {

        String sexo = "mujer";
        int edad = 18;

        if (sexo.equals("hombre")) {
            System.out.println("La persona es hombre");
        } else {
            System.out.println("La persona es mujer");            
        }
    }

}