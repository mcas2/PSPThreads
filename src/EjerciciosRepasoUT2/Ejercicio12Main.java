package EjerciciosRepasoUT2;

public class Ejercicio12Main {
    public static void main(String[] args) {
        Ejercicio12 pares = new Ejercicio12("pares: ", true);
        Ejercicio12 impares = new Ejercicio12("impares: ",false);

        pares.start();
        impares.start();
    }
}
