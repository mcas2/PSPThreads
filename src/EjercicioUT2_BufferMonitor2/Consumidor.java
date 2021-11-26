package EjercicioUT2_BufferMonitor2;


public class Consumidor extends Thread
{
    BufferMonitor monitor;

    Consumidor(BufferMonitor monitor, String name)
    {
        super(name);
        this.monitor = monitor;
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            monitor.get(this.getName());
        }
    }
}
