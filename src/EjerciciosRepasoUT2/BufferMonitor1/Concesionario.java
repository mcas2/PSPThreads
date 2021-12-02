package EjerciciosRepasoUT2.BufferMonitor1;

import java.util.ArrayList;

public class Concesionario {
    ArrayList<String> escaparate = new ArrayList<>();
    String venta;
    String ultimo = "";
    int cont = 0;

    public synchronized void producir (String modelo, String name){
        while   (escaparate.size()==30 || modelo.equals(ultimo)){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        escaparate.add(modelo);
        ultimo = modelo;
        System.out.println(name + " ha producido "+modelo);
        notifyAll();
    }

    public synchronized void consumir(String clase, String nombre){
        while (escaparate.isEmpty()
                ||(!escaparate.get(0).contains("Porsche")&&clase.equals("alta"))||
                (!escaparate.get(0).contains("BMW")&&clase.equals("media"))||
                (!escaparate.get(0).contains("Seat")&&clase.equals("baja"))
        ){
            try {
                ultimo = "";
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        venta = escaparate.remove(0);
        System.out.println(nombre + " ha comprado un "+ venta);
    }
}
