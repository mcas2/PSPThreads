package EjerciciosUT2;

public class Ejercicio02 extends Thread {

    public Ejercicio02 (){
        super();
    }

    @Override
    public void run() {
        System.out.println("Hola mundo: " + this.getId());
    }

}
