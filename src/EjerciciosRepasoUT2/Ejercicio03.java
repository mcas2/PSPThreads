package EjerciciosRepasoUT2;

public class Ejercicio03 implements Runnable {
    Thread t;
    String catena;

    public Ejercicio03 (String catena) {
        this.catena = catena;
        t = new Thread(this,"Filum"); //reemplaza al identificador
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Ave mundus - "+ catena + " - "+ t.getName() + " - " + t.getId());
    }
}
