package EjerciciosUT2;

public class Ejercicio03 implements Runnable {

    String cadena = "Cadena";
    //int id;
    Thread t1;

    public Ejercicio03 (String cadena) {
        this.cadena = cadena;
        t1 = new Thread(this);
        t1.start();
    }

    public void run(){
        System.out.println("Hola mundo: " + cadena + " Identificador: " + t1.getId());
    }

    //public void setID (int id){
    //    this.id = id;
    //}
}
