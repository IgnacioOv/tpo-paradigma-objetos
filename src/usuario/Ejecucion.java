package usuario;

import negocio.*;
import java.util.Scanner;


public class Ejecucion {
    public static void main(String[] args) {
        inicio();
    }



    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        Catalogo c = new Catalogo();
        int menu = 0;
        while (menu != -1) {
            System.out.println("BIENVENIDO AL MENU PRINCIPAL SI DESEA FINALIAR EL PROGRAMA INGRESE -1:");
            System.out.println("1- Ver Catalogo:");
            System.out.println("2- Realizar Compra:");
            System.out.println("Elija su opcion:");
            menu = sc.nextInt();
            if (menu == 1) {
                Catalogo(c,sc);
            }
            if (menu == 2) {
                Venta v = new Venta();
                RealizarVenta(v,c,sc);
            }
        }
    }


    public static void RealizarVenta(Venta v,Catalogo c, Scanner sc) {
       System.out.println("Ingrese el codigo del producto");
       int cod = sc.nextInt();
       Producto p = c.buscarProductoPorCodigo(cod);
         if (p == null) {
              System.out.println("El producto no existe");
         } else {
             v.setProducto(p);
              System.out.println("Ingrese la cantidad que desea comprar");
              int cant = sc.nextInt();
              if (!p.compararStock()) {
                System.out.println("No hay stock suficiente");
              } else {
                  v.setCantidad(cant);
                p.reducirStock(cant);
                int monto = p.getPrecio() * cant;
                System.out.println("Elegir medio de pago");
                System.out.println("1- Efectivo , 2- Credito , 3- Debito");
                int medio = sc.nextInt();
                  switch (medio) {
                      case 1 -> {
                          Efectivo efec = new Efectivo();
                          efec.setMonto(monto);
                          System.out.println("El monto a pagar es: " + efec.calcularPago());
                          v.setMonto(efec.calcularPago());
                          v.setMedioPago(efec);
                      }
                      case 2 -> {
                          Credito cred = new Credito();
                          System.out.println("Ingrese la cantidad de cuotas");
                          int cuotas = sc.nextInt();
                          cred.setCuotas(cuotas);
                          cred.setMonto(monto);
                          System.out.println("El monto a pagar es: " + cred.calcularPago());
                          v.setMonto(cred.calcularPago());
                          v.setMedioPago(cred);
                      }
                      case 3 -> {
                          Debito deb = new Debito();
                          deb.setMonto(monto);
                          System.out.println("El monto a pagar es: " + deb.calcularPago());
                          v.setMonto(deb.calcularPago());
                          v.setMedioPago(deb);
                      }
                      default -> System.out.println("Opcion incorrecta");
                  }

              }

         }
        System.out.println("Compra realizada");
        System.out.println("-----------------");
        System.out.println("Se ha comprado el producto " + p.getNombre());
        System.out.println("En cantidad de " + v.getCantidad() + " unidades");
        System.out.println("Por un total de " + v.getMonto());


    }


    public static void Catalogo(Catalogo cat, Scanner scan) {
        cat.mostrarCatalogo();
        int menu = 0;
        while (menu != 4) {
            System.out.println("-----------------");
            System.out.println("ESTE ES EL CATALOGO ACTUAL QUE DESEA HACER:");
            System.out.println("1- Agregar Producto:");
            System.out.println("2- Modificar Producto:");
            System.out.println("3- Eliminar Producto");
            System.out.println("4- Volver al menu principal");
            menu = scan.nextInt();
            if (menu == 1) {
                Producto p = new Producto();
                newProducto(p,scan,cat);
                Catalogo(cat,scan);
                //Catalogo(cat)
            }
            if (menu == 2) {
                System.out.println("Todavia no esta hecho");

                /// codigo

                Catalogo(cat,scan);

            }
            if (menu == 3) {
                System.out.println("Ingrese el codigo del producto que quiera eliminar");
                int cod = scan.nextInt();
                cat.eliminarProducto(cod);
                System.out.println("Producto Eliminado");
                System.out.println("-----------------");
                Catalogo(cat,scan);
            }
        }

    }

    public static void newProducto(Producto p, Scanner sc, Catalogo c) {
        System.out.println("Nombre Producto:");
        String nombre = sc.next();
        p.setNombre(nombre);
        System.out.println("Descripcion Producto:");
        String desc = sc.next();
        p.setDescripcion(desc);
        System.out.println("Codigo Producto:");
        int codigo = sc.nextInt();
        p.setCodigo(codigo);
        System.out.println("Precio Producto:");
        int precio = sc.nextInt();
        p.setPrecio(precio);
        System.out.println("Stock Actual Producto:");
        int stock = sc.nextInt();
        p.setStock(stock);
        System.out.println("Stock minimo Producto:");
        int stockMin = sc.nextInt();
        p.setStockMinimo(stockMin);
        c.cargarProducto(p);
        System.out.println("Producto agregado");
        System.out.println("-----------------");
    }

}