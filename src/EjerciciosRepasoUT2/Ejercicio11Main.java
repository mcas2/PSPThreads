package EjerciciosRepasoUT2;

public class Ejercicio11Main {
    public static void main(String[] args) {
        Ejercicio11 conejo = new Ejercicio11("Conejo");
        Ejercicio11 cigarra = new Ejercicio11("Cigarra");
        Ejercicio11 tortuga = new Ejercicio11("Tortuga");

        conejo.start();
        cigarra.start();
        tortuga.start();
    }
}
