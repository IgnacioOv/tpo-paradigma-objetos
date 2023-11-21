package usuario;

import negocio.*;
import java.util.Scanner;


public class Ejecucion {
    public static void main(String[] args) {
        inicio();
    	/*
    	/*
        Producto p = new Producto();
        p.setStock(10);
        p.setCodigo(1);
        p.setPrecio(100);
        p.setStockMinimo(5);
        p.setNombre("Producto 1");
        p.setDescripcion("Descripcion 1");


        c.cargarProducto(p);
        c.mostrarCatalogo();

        Credito cred = new Credito();
        cred.setCuotas(3);
       */
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
                Compra();
            }
        }
    }


    public static void Compra() {

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
                newProducto(p,scan);
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

    public static void newProducto(Producto p, Scanner sc) {
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
        System.out.println("Producto agregado");
        System.out.println("-----------------");
    }

}