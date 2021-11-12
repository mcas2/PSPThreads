package EjercicioUT2_Ordenar;

public class EjecutarOrdenar {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        LibreriaOrdenar ordenar = new LibreriaOrdenar();
        HiloOrdenar h1 = new HiloOrdenar("Hilo1tipo1", numbers, ordenar);
        HiloOrdenar h2 = new HiloOrdenar("Hilo2tipo1", numbers, ordenar);
        h1.start();
        h2.start();
    }
}
