package EjerciciosRepasoUT2.Ejercicio13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio13Main {
    public static void main(String[] args) throws FileNotFoundException {
        String lineas = "";
        BufferedReader bf = new BufferedReader(new FileReader("notas.txt"));

        try {
            while ((lineas = bf.readLine()) != null){
                Ejercicio13 e13 = new Ejercicio13(lineas);
                e13.start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
