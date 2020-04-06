package app.ciclosJava;

public class Ciclos {


    public static void main(String[] args) {

        Ciclos ciclos = new Ciclos();

        ciclos.doWhile();
        
    }



    public void cicloFor() {

        for (int i = 0; i < 10; i++) {
            System.out.println("I vale " + i);
        }
    }

    public void cicloWhile() {

        int i = 0;

        while (i < 10) {
            i++;
            if (i == 10) {
                System.out.println("I ya vale 10");
                break;
            }
            System.out.println("I aun no vale 10, vale" + i);
        }
    }

    public void doWhile() {

        int i = 1;

        do {
            i++;
            if (i % 2 == 0)             {
                System.out.println(i);
            }
        } while (i<=100);
    }
 
}