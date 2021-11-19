package EjercicioUT2ProductorConsumidorMonitor;

public class BufferMonitor {
    private boolean turnoConsumidor = false;
    private String opcion = "";

    public BufferMonitor() {

    }

    public synchronized void get(String nombre){
        while (!turnoConsumidor){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("El consumidor "+nombre+" ha cogido una tarta de "+ opcion);
        opcion = "";
        turnoConsumidor = false;
        notifyAll();
    }

    public synchronized void put(String nombre, String sabor){
        while (turnoConsumidor){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        opcion = sabor;
        System.out.println("El productor "+nombre+" ha hecho una tarta de "+sabor);
        turnoConsumidor = true;
        notifyAll();
    }
}
