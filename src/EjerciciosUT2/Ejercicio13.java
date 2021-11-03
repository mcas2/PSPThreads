package EjerciciosUT2;

import java.io.*;

public class Ejercicio13 implements Runnable {
    String notas;
    Thread t;

    public Ejercicio13(String notas){
        this.notas = notas;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Notas de " + obtainGradesInString()[0]);
        System.out.println(calculateMean(obtainGradesInString()));
    }

    public String [] obtainGradesInString (){
        return notas.split(" ");
    }

    public double calculateMean (String[] notas){
        Double media = 0.0;
        for (int i = 1; i < notas.length; i++) {
            media += Double.parseDouble(notas[i]);
        }
        return media/notas.length;
    }
}
