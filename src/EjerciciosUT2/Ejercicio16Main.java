package EjerciciosUT2;

public class Ejercicio16Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        Runtime runtime = Runtime.getRuntime();
        int numCores = runtime.availableProcessors();

        System.out.println("\n" + "Número de núcleos: " + numCores);

        for (int i = 0; i < numCores; i++) {
            b = a + 1000000/numCores;
            Ejercicio16 ej16 = new Ejercicio16(a, b);
            a = b;
            ej16.start();
        }
    }
}
