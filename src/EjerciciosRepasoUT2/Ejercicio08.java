package EjerciciosRepasoUT2;

public class Ejercicio08 extends Thread{
    int initium;
    int terminus;
    String nomen;

    public Ejercicio08 (int initium, int terminus, String nomen){
        this.initium=initium;
        this.terminus=terminus;
        this.nomen=nomen;
    }

    @Override
    public void run() {
        for (int i = initium; i < terminus; i++) {
            System.out.println(i + " " + nomen);
        }
    }
}
