package EjercicioUT2_CuentaBancaria;

public class Cuenta {
	private int saldo;

	public Cuenta(int s) {
		saldo = s;
	}

	public int getSaldo() {
		return saldo;
	}

	public void restar (int cantidad) {
		saldo = saldo - cantidad;
	}

	synchronized void retirarDinero(int cant, String nom) {
		if (getSaldo() >= cant) {
			System.out.println(nom + ": SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo() + ")");
			try {
				// Hacemos este sleep para asegurarnos de que el hilo se duerma mientras el otro
				// hace las operaciones
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			restar(cant);

			System.out.println("\t" + nom + " retira =>" + cant + " ACTUAL(" + getSaldo() + ")");
		} else {
			System.out.println(nom + " No puede retirar dinero, NO HAY SALDO(" + getSaldo() + ")");
		}
		if (getSaldo() < 0) {
			System.out.println("SALDO NEGATIVO => " + getSaldo());
		}
	}
}
