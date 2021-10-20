public class HiloNombreMain {
    public static void main(String[] args) {

        //No tendría sentido meterle el atributo nombre a la clase HiloNombre,
        //¡el verdadero nombre del hilo se pone al crear el Thread!
        HiloNombre hn = new HiloNombre("Hilo 1");
        Thread th = new Thread (hn, hn.nombre);

        System.out.println("El nombre del hilo es: " + th.getName());
        th.start();
    }
}
