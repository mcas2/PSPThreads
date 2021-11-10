package EjerciciosUT2;

public class Ejercicio16 extends Thread {
    int min;
    int max;

    public Ejercicio16 (int min, int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = min; i <= max; i++) {
            if (esPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public boolean esPrimo (int num) {
        boolean siSoy = true;
        if (num != 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    siSoy = false;
                    num = 0;
                }
            }
        }
        return siSoy;
    }
}
