package EjercicioUT2_BufferMonitor;

import EjercicioUT2_Semaforo.BufferSemaforo;

public class BufferMonitor {
    private boolean turnoConsumidor = false;
    private String contenido = "";
    public BufferMonitor(){

    }

    public synchronized String get(String name){
        while (!turnoConsumidor){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        String resultado = contenido;
        contenido="";
        System.out.println(name+" Consumiendo: "+resultado);
        turnoConsumidor = false;
        notifyAll();
        return resultado;
    }

    public synchronized void put(String cadena, String name){
        while (turnoConsumidor) {
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + "--> Produciendo: "+cadena);
        contenido = cadena;
        turnoConsumidor = true;
        notifyAll();
    }
}
