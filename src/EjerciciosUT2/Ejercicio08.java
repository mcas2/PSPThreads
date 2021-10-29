package EjerciciosUT2;

public class Ejercicio08 implements Runnable {
    Thread t;
    int contador;
    String nombre;
    int limite;

    public Ejercicio08 (int contador, int limite, String nombre) {
        this.contador = contador;
        this.nombre = nombre;
        this.limite = limite;
        t = new Thread(this,nombre);
        t.start();
    }

    @Override
    public void run() {
        for (int i = contador; i < limite; i++) {
            System.out.println("El hilo " + nombre +"/"+ t.getName() + " muestra: " + i);
        }
    }
}
