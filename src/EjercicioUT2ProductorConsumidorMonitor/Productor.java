package EjercicioUT2ProductorConsumidorMonitor;

public class Productor extends Thread {
    private BufferMonitor vitrina; //Puede que haya q cambiar este nombre y el del método producción por vt por ejemplo
    private String nombre;
    private String sabor;
    private int cantidad;
    //Nombre, sabor, cantidad

    public Productor(BufferMonitor vitrina, String nombre, String sabor, int cantidad){
        super(nombre);
        this.nombre = nombre;
        this.vitrina = vitrina;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            vitrina.put(nombre, sabor);
        }
    }
}
