package EjerciciosRepasoUT2;

public class Ejercicio12 extends Thread {
    boolean flag;

    public Ejercicio12(String name, boolean flag){
        super(name);
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (flag) {
                if (i % 2 == 0) {
                    System.out.println(getName() + i);
                }
            }
            else {
                if (i % 2 != 0) {
                    System.out.println(getName() + i);
                }
            }
        }
    }
}
