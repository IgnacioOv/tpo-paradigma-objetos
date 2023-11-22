package negocio;

import java.util.ArrayList;
public class Catalogo {
	ArrayList <Producto> listaProductos;
	
	public Catalogo(){
		listaProductos = new ArrayList<Producto>();
	}

	public void cargarProducto(Producto p) {
		listaProductos.add(p);
	}

	public void eliminarProducto(int codigo) {
		for(int i = 0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getCodigo() == codigo) {
				listaProductos.remove(i);
			}
		}
		
	}

	public void mostrarCatalogo() {
		System.out.println("Catálogo de Productos:");

		for (Producto producto : listaProductos) {
			System.out.println("Código: " + producto.getCodigo());
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Descripcion: " + producto.getDescripcion());
			System.out.println("Stock: " + producto.getStock());
			System.out.println("Precio: " + producto.getPrecio());
			// Agrega aquí más líneas para mostrar otros atributos del producto según sea necesario
			System.out.println("---------------");
	}
	}

	public Producto buscarProductoPorCodigo(int codigo) {
		for (Producto producto : listaProductos) {
			if (producto.getCodigo() == codigo) {
				return producto;
			}
		}
		return null;
	}
}
