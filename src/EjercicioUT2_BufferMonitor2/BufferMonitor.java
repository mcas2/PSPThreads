package EjercicioUT2_BufferMonitor2;

import java.util.ArrayList;
import java.util.Random;

public class BufferMonitor {
    ArrayList<String> contenido;
    String anterior = "";

    public BufferMonitor() {
        contenido=new ArrayList<String>();
    }

    public synchronized String get(String name) {
        String resultado;
        while (contenido.isEmpty())// No hay consumidor
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        resultado = contenido.remove(0); // resultado = ""
        System.out.println(name + " se lleva una " + resultado);
        notifyAll();
        return resultado;
    }

    public synchronized void put(String sabor, String name) {
        while (contenido.size()==10 || sabor.equals(anterior)) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " produce una " + sabor);
        contenido.add(sabor);
        anterior = sabor;
        notifyAll();
    }
}