package EjerciciosUT2;

import java.io.*;

public class Ejercicio13 implements Runnable {
    String notas;

    public Ejercicio13(String notas){
        this.notas = notas;
    }

    @Override
    public void run() {
        obtainGradesInString();
        calculateMean();
    }

    public String [] obtainGradesInString (){
        return notas.split(" ");
    }

    public void readFile() {
        String linea = "";
        BufferedReader bf;

        try {
            bf = new BufferedReader(new FileReader("notas.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
