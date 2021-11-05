package EjerciciosUT2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15Ordenar extends Thread {
    int [] numList;

    public Ejercicio15Ordenar (int[] numList) {
        this.numList = numList;
    }

    @Override
    public void run() {
        super.run();
        orderArray(numList);
    }

    public void orderArray (int[] numList) {
        for (int j = 1; j < numList.length; j++) {
            int i = j-1;
            int aux = numList[j];

            while (i>=0&&aux<numList[i]){
                numList[i+1] = numList [i];
                numList[i] = aux;
                i--;
            }
        }
    }
}
