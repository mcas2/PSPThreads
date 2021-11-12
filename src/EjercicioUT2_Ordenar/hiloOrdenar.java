package EjercicioUT2_Ordenar;

public class hiloOrdenar extends Thread {
    String nombre;
    int[] numbers;
    libreriaOrdenar ordenar;

    public hiloOrdenar(String nombre, int[] numbers, libreriaOrdenar ordenar){
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
