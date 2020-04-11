package app.encapsulmiento;

public class Principal {


    public static void main(String[] args) {
        
        Profesor profesor = new Profesor();

        // profesor.nombre = "Jose";
        profesor.setNombre("Felipe gonzalez");
        // profesor.indetificacion = "1031168217";
        // profesor.sueldo = 1500.33;

        System.out.println("Nombre: " + profesor.getNombre());
        


    }

}