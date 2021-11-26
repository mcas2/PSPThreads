package EjercicioUT2_BufferMonitor3;

import java.util.ArrayList;

public class BufferMonitor {
    ArrayList<String> estanteria;
    String anteriorLata="";
    int cont= 0;

    public BufferMonitor(){estanteria = new ArrayList<String>();}

    public synchronized String get (String nombre){
        String resultado;
        while(estanteria.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        resultado = estanteria.remove(0);
        cont++;
        System.out.println(nombre + " compra una lata de pintura " + resultado + " con código 00" + cont);
        notifyAll();
        return resultado;
    }

    public synchronized void put (String nombre, String color){
        while (estanteria.size() == 250 || color.equals(anteriorLata)){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        anteriorLata = color;
        System.out.println(nombre + " produce " +color);
        estanteria.add(color);
        notifyAll();
    }
}
