package negocio;

public class Credito extends Pago{
	int cuotas;

	public int getCuotas() {
		return cuotas;
	}
	public int calcularPago() {
		if (cuotas == 2 || cuotas == 3 || cuotas == 6) {

			if (cuotas == 2) {
				monto = (int) (monto * 1.06);
			} else if (cuotas == 3) {
				monto = (int) (monto * 1.12);
			} else {
				monto = (int) (monto * 1.2);
			}
		} else {
			System.out.println("Error: El número de cuotas debe ser 2, 3 o 6.");
		}
		return monto;
	}
}

