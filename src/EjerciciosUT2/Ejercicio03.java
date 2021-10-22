package EjerciciosUT2;

public class Ejercicio03 implements Runnable {

    String cadena = "Cadena";
    int id;
    Thread t1;

    public Ejercicio03 (String cadena) {
        this.cadena = cadena;
    }

    public void run(){
        System.out.println("Hola mundo: " + cadena + " Identificador: " + id);
    }

    public void setID (int id){
        this.id = id;
    }
}
