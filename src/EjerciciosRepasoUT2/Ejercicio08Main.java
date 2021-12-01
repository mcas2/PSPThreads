package EjerciciosRepasoUT2;

public class Ejercicio08Main {
    public static void main(String[] args) {
        Ejercicio08 e1 = new Ejercicio08(0, 20, "Filum I");
        Ejercicio08 e2 = new Ejercicio08(20, 40, "Filum II");
        Ejercicio08 e3 = new Ejercicio08(40, 60, "Filum III");
        Ejercicio08 e4 = new Ejercicio08(60, 80, "Filum IV");
        e1.start();
        try { //solo aqui irá ordenado
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        e2.start();

        e3.start();

        e4.start();
    }
}
