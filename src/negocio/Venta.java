package negocio;
import java.util.ArrayList;
import java.util.List;
public class Venta {
	Producto producto;
	int cantidad;
	Pago medioPago;
	double monto;
	private List<Producto> sinStockProductos = new ArrayList<>();
	private List<Producto> pocoStockProductos = new ArrayList<>();

	public List<Producto> SinStock() {
		return new ArrayList<>(sinStockProductos);
	}
	public List<Producto> PocoStock() {
		return new ArrayList<>(pocoStockProductos);
	}
	
	void RealizarVenta(){
		if(producto.getStock() == 0) {
			sinStockProductos.add(producto);
		}
		else if(producto.getStock() < 10) {
			pocoStockProductos.add(producto);
		}
		else {
			producto.setStock(producto.getStock() - cantidad);
		}
	}
	public void setMedioPago(Pago medioPago) {
		this.medioPago = medioPago;
	}

	public void getMonto() {
		monto = medioPago.calcularPago();
	}
}
