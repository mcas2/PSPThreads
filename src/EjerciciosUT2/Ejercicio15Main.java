package EjerciciosUT2;

import java.util.Random;

public class Ejercicio15Main {
    static Random r = new Random(1000);

    public static void main(String[] args) {

        int[] numList = new int[100000];
        int[] numList2 = new int[100000];
        numList = fillArray(numList);
        Ejercicio15Ordenar orden = new Ejercicio15Ordenar(numList);
        Ejercicio15Ordenar orden2 = new Ejercicio15Ordenar(numList2);

        long start = System.currentTimeMillis();
        orden.start();orden2.start();
        try { //ESTO HACE QUE TARDE 3 SEGUNDOS MÁS
            orden.join();
            orden2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long timeWasted = end-start;

        System.out.println("Tarda " + (double)timeWasted/1000);
    }

    public static int[] fillArray (int[] numList) {
        for (int i = 0; i < 100000; i++) {
            numList[i]= r.nextInt(1000);
        }
        return numList;
    }
}
