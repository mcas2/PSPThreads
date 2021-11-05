package EjerciciosUT2;

import java.lang.reflect.Array;
import java.util.*;

public class Ejercicio14 implements Runnable {
    Thread t;
    Random r = new Random(1);
    int [] numList = new int[100000];
    int [] numList2 = new int[100000];
    long startSeconds, endSeconds;
    double timeWasted;

    public Ejercicio14() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        startSeconds = System.currentTimeMillis();
        numList = fillArray();
        System.out.println(Arrays.toString(numList));
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println(Arrays.toString(orderArray(numList)));
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");

        numList2 = fillArray();
        System.out.println(Arrays.toString(numList2));
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println(Arrays.toString(orderArray(numList2)));
        endSeconds = System.currentTimeMillis();
        timeWasted = (double) (endSeconds - startSeconds);
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("El tiempo invertido en segundos es: " + timeWasted/1000);
    }
    
    public int[] fillArray () {
        int[] numList = new int[100000];
        for (int i = 0; i < 100000; i++) {
            numList[i]= r.nextInt(1000);
        }
        return numList;
    }

    public int[] orderArray (int[] numList) {
        for (int j = 1; j < numList.length; j++) {
            int i = j-1;
            int aux = numList[j];

            while (i>=0&&aux<numList[i]){
                numList[i+1] = numList [i];
                numList[i] = aux;
                i--;
            }
        }
        return numList;
    }
}
