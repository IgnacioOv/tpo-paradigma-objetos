package negocio;

public class Producto {
	int codigo;
	int precio;
	int stockActual;
	int stockMinimo;
	String nombre;
	String descripcion;
	
	public void reducirStock() {
		stockActual--;
	}
	
	public void compararStock() {
		if(stockActual < stockMinimo) {
			System.out.println("El stock actual es menor al stock minimo");
		}
	}
	public int getCodigo(){
		return codigo;
	}

	public int getStock(){
		return stockActual;
	}
}
