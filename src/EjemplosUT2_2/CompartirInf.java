package EjemplosUT2_2;

public class CompartirInf {
    public static void main(String[] args) {
        /*
        * Podríamos utilizar una clase para decrementar y otra para incrementar
        * en lugar de hacer 5 hilos como un gilipollas. Pueden salir distintos
        * hilos de la misma clase.
        * */

        Contador cont = new Contador(0);
        HiloA a = new HiloA("HiloA",  cont);
        HiloB b = new HiloB("HiloB",  cont);
        HiloC c = new HiloC("HiloC",  cont);
        HiloD d = new HiloD("HiloD",  cont);
        HiloE e = new HiloE("HiloE",  cont);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
