package EjercicioUT2_Ordenar;

public class ejecutarOrdenar {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        libreriaOrdenar ordenar = new libreriaOrdenar();
        hiloOrdenar h1 = new hiloOrdenar("Hilo1tipo1", numbers, ordenar);
        hiloOrdenar h2 = new hiloOrdenar("Hilo2tipo1", numbers, ordenar);
        h1.start();
        h2.start();
    }
}
