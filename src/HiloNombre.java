public class HiloNombre implements Runnable {

    String nombre;
    public HiloNombre (String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        System.out.println("Hio nombre creado.");
        System.out.println("El nombre del hilo es: "+ nombre);
        System.out.println("Hilo nombre finalizado");
    }
}
