package EjercicioUT2_BufferMonitor3;

public class BufferMonitor {
    boolean turnoConsumidor = false;

    public String get(String nombre, String color){
        while(turnoConsumidor){
            System.out.println(nombre + " compra una lata de pintura " + color);
        } return nombre;
    }

    public void put(){

    }
}
