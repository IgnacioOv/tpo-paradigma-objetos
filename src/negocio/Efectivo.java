package negocio;

public class Efectivo extends Pago{

	public int calcularPago() {

		monto = (int) (monto*0.9);
		return monto;
	}
}
