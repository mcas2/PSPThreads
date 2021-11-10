package EjemplosUT2_2;

public class HiloD extends Thread {
    private Contador contador;

    public HiloD (String n, Contador c){
        setName(n);
        contador = c;
    }

    @Override
    public void run() {
        synchronized (contador) {
            for (int i = 0; i < 5000; i++) {
                contador.incrementa();
            }
            System.out.println(getName() + " contador vale " + contador.getValor());
        }
    }
}
