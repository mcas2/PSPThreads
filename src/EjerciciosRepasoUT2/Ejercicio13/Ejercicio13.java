package EjerciciosRepasoUT2.Ejercicio13;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio13 extends Thread {
    String lineas;
    double suma = 0;

    public Ejercicio13(String lineas){
       this.lineas = lineas;
    }

    @Override
    public void run() {
        String [] lista = lineas.split(" ");
        for (int i = 1; i < lista.length; i++) {
            suma += Double.parseDouble(lista[i]);
        }

        double media = (suma/(lista.length-1));
        System.out.println(lista[0]+ " tiene media de "+ media);
    }
}
