package EjerciciosRecursividad;

public class Ejercicio02 {
    public static void main(String[] args) {
        int lista [] = new int [10];
        for (int i = 0; i < 10; i++) {
            lista[i] = i;
        }
        recorrer(lista, lista.length-1);
    }

    public static void recorrer(int[] lista, int i){
        if (i>=0) {
            System.out.println(lista[i]);
            recorrer(lista, i-1);
        }
    }
}
