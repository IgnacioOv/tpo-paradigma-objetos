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

	public void setStock(int stock){
		stockActual = stock;
	}
	public void setCodigo(int codigoProducto){
		codigo = codigoProducto;
	}

	public void setPrecio(int precioProducto){
		precio = precioProducto;
	}
	public int getPrecio(){
		return precio;
	}
	public void setStockMinimo(int stockMinimoProducto){
		stockMinimo = stockMinimoProducto;
	}
	public void setNombre(String nombreProducto){
		nombre = nombreProducto;
	}
	public void setDescripcion(String descripcionProducto){
		descripcion = descripcionProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void modificarProducto(int nuevoCodigo, int nuevoPrecio, int nuevoStockActual, int nuevoStockMinimo, String nuevoNombre, String nuevaDescripcion) {
		codigo = nuevoCodigo;
		precio = nuevoPrecio;
		stockActual = nuevoStockActual;
		stockMinimo = nuevoStockMinimo;
		nombre = nuevoNombre;
		descripcion = nuevaDescripcion;
	}

}
