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

    }

    public int Fibonacci (int num) {
        ++num;
        return Fibonacci(num);
    }
}
