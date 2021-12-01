package EjerciciosRepasoUT2;

public class Ejercicio06 extends Thread{
    int num;
    String nomen;

    public Ejercicio06 (int num, String nomen){
        this.num = num;
        this.nomen = nomen;
    }

    @Override
    public void run() {
        System.out.println("Sucesión de Fibonacci del hilo " + nomen);
        System.out.println(0 + "\n" +1);

        int n1=0, n2=1 ,n3;

        for (int i = 2; i < num; i++) {
            n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
