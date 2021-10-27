package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        System.out.println("La suma de los números hasta " + num + " es: " + sumar(num));
    }

    public static int sumar(int num){
        if (num > 0) {
            return num + sumar(num-1);
        } else
            return 0;
    }
}
