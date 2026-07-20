package variables;

public class Producto {

    // Variables de instancia
    String nombre;
    double precio;
    int stock;

    // Variable estática
    static double iva = 0.13;

    public void mostrarProducto() {

        // Variable local
        double precioFinal = precio + (precio * iva);

        System.out.println("====== PRODUCTO ======");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("IVA: " + (iva * 100) + "%");
        System.out.println("Precio Final: " + precioFinal);
        System.out.println("Stock: " + stock);
        System.out.println();
    }

    public static void main(String[] args) {

        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 6500;
        p1.stock = 8;

        Producto p2 = new Producto();
        p2.nombre = "Mouse";
        p2.precio = 120;
        p2.stock = 30;

        Producto p3 = new Producto();
        p3.nombre = "Teclado";
        p3.precio = 300;
        p3.stock = 15;

        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();

    }

}