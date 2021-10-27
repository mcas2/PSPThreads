package EjerciciosUT2;

public class Ejercicio06 implements Runnable {
    Thread t;
    int num;


    public Ejercicio06 (int num) {
        this.num = num;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("La posición " + num + " de Fibonacci es " + fibonacci(num));
    }

    public int fibonacci (int num) {
        if (num == 0 || num ==1) {
            return num;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
