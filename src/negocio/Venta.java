package negocio;

public class Venta {
	Producto producto;
	int cantidad;
	Pago medioPago;
	double monto;
	
	Producto[] SinStock(){
		Producto[] producto = null;
		return producto;
	}
	Producto[] PocoStock(){
		Producto[] producto = null;
		return producto;
	}
	
	void RealizarVenta(){}
}
