public class EjemploRecursivo01 {
    public static void repetir(int x) {
        if (x>0) {
            System.out.println(x);
            repetir(x - 1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        repetir(5);
    }
}