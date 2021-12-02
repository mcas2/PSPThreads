package EjerciciosRepasoUT2;

public class Ejercicio11 extends Thread{

    public Ejercicio11(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " ha recorrido " + (i+1) + " metros.");
        }
        System.out.println("¡"+getName() + " ha llegado!");
    }
}
