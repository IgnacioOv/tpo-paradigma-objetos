package usuario;

import negocio.*;

public class Ejecucion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setStock(10);
        p.setCodigo(1);
        p.setPrecio(100);
        p.setStockMinimo(5);
        p.setNombre("Producto 1");
        p.setDescripcion("Descripcion 1");

        Catalogo c = new Catalogo();
        c.cargarProducto(p);
        c.mostrarCatalogo();

        Credito cred = new Credito();
        cred.setCuotas(3);



    }

}
