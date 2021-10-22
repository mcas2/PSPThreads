package EjerciciosUT2;

public class Ejercicio04 extends Thread {

    int numero;

    public Ejercicio04 (int numero, String nombre) {
        super(nombre);
        this.numero=numero;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            System.out.println(this.getName()+" "+i);
        }
    }
}
