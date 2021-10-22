package EjerciciosUT2;

public class Ejercicio05 implements Runnable{

    int num;
    String nombre;
    Thread t;

    public Ejercicio05 (int num, String nombre) {
        this.num = num;
        this.nombre = nombre;
        t = new Thread(this, nombre);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(t.getName() + " " + i);
        }
    }
}
