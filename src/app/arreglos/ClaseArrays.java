package app.arreglos;

import java.util.Arrays;

public class ClaseArrays {

    int[] cantidades = {5,4,3,2,1};

    public static void main(String[] args) {
    
        ClaseArrays claseArrays = new ClaseArrays();

        // claseArrays.rellenarValores();
        // claseArrays.leerArreglo();

        // System.out.println("-----------------");
        // claseArrays.OrdenarValoes();
        // claseArrays.leerArreglo();

        claseArrays.buscarValor();

    }


    public void leerArreglo() {
        
        for(int valor : cantidades) {
            System.out.println(valor);
        }
    }

    public void rellenarValores() {

        Arrays.fill(cantidades, 100);

    }

    public void OrdenarValoes() {
        Arrays.sort(cantidades);
    }

    public void buscarValor() {
        
        String[] nombreEmpleados = {"Pedro", "Maria", "Juan"};

        Arrays.sort(nombreEmpleados);

        int index =  Arrays.binarySearch(nombreEmpleados, "Pedro");

        System.out.println("La palabra pedro la encontré enla pocision " + index);
    }
}