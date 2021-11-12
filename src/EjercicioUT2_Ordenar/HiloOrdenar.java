package EjercicioUT2_Ordenar;

public class HiloOrdenar extends Thread {
    String nombre;
    int[] numbers;
    LibreriaOrdenar ordenar;

    public HiloOrdenar(String nombre, int[] numbers, LibreriaOrdenar ordenar){
        this.ordenar = ordenar;
        this.nombre = nombre;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        synchronized (ordenar){
            System.out.println("\n"+nombre);
            ordenar.fillArray(numbers);
            ordenar.orderArray(numbers);
            ordenar.printArray(numbers);
        }
    }
}
