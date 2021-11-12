package EjercicioUT2_Ordenar;

import java.util.Random;

public class LibreriaOrdenar {
    Random r = new Random();
    public void fillArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
    }

    public void orderArray(int[] numbers){
        for (int j = 1; j < numbers.length; j++) {
            int i = j-1;
            int aux = numbers[j];

            while (i>=0&&aux<numbers[i]){
                numbers[i+1] = numbers [i];
                numbers[i] = aux;
                i--;
            }
        }
    }

    public void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
