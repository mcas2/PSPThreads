package EjercicioUT2_Semaforo;

import java.util.concurrent.Semaphore;

public class BufferSemaforo {
    private int elemento = 1;

    static Semaphore puedeConsumir = new Semaphore(0);
    static Semaphore puedeProducir = new Semaphore(1);

    void get(String name){
        try{
            puedeConsumir.acquire();
        } catch (InterruptedException e){
            System.out.println("InterruptedException caught");
        }
        System.out.println("El consumidor "+name+" ha consumido el elemento: "+elemento);
        elemento = -1; //Comprobar que no se está imprimiendo menos 1 y que el código está bien. Comentable.
        puedeProducir.release();
    }

    void put (String name, int elemento){
        try {
            puedeProducir.acquire();
        } catch (InterruptedException e){
            System.out.println("InterruptedException caught");
        }

        this.elemento = elemento;
        System.out.println("El "+name+" ha producido: "+elemento);
        puedeConsumir.release(); //Pone a 1 el semáforo de puedeConsumir.
    }
}
