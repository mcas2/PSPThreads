package EjerciciosUT2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio13Main {
    public static void main(String[] args) {
        String linea = "";
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader("notas.txt")); //Chuleta para el examen
            while((linea = bf.readLine())!= null) {
                Ejercicio13 e13 = new Ejercicio13(linea);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
