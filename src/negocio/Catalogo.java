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

	public void modificarProducto() {
		
	}
	
	public void eliminarProducto(int codigo) {
		for(int i = 0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getCodigo() == codigo) {
				listaProductos.remove(i);
			}
		}
		
	}

	public void mostrarCatalogo() {
		for (Producto listaProducto : listaProductos) {
			System.out.println(listaProducto.getNombre());
		}
	}
}
