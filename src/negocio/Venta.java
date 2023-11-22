package negocio;
import java.util.ArrayList;
import java.util.List;
public class Venta {
	Producto producto;
	int cantidad;
	Pago medioPago;
	double monto;

	public void setMedioPago(Pago medioPago) {
		this.medioPago = medioPago;
	}
	public double getMonto() {
		monto = medioPago.calcularPago();
		return monto;
	}
	public void setProducto(Producto p) {
		producto = p;
	}
	public void setCantidad(int c) {
		cantidad = c;
	}
	public void setMonto(double m) {
		monto = m;
	}
	public int getCantidad() {
		return cantidad;
	}
}


