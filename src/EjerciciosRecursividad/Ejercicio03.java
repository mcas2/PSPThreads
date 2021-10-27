package EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        System.out.println(fibonacci(num));
    }

    public static int fibonacci (int num) {
        if (num == 0 || num ==1) {
            return num;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
