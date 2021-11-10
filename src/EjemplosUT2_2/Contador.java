package EjemplosUT2_2;

public class Contador {
    private int c = 0;
    Contador (int c){
        this.c=c;
    }

    public void incrementa(){
        c += 1;
    }

    public void decrementa(){
        c -=1;
    }

    public int getValor(){
        return c;
    }
}
