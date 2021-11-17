package EjercicioUT2_CuentaBancaria;

public class SacarDinero extends Thread {
	private Cuenta c;

	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c = c;
	}

	public void run() {
		for (int x = 1; x <= 3; x++) {
			c.retirarDinero(10, getName());
		}
	}
}
