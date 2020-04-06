package app.entradaDeDatos;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double sueldo;

        System.out.println("Como te lllamas ? ");

        nombre = entrada.nextLine();

        System.out.println(nombre);
        
    }

}