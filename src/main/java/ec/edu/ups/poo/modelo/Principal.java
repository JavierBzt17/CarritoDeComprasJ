package ec.edu.ups.poo.modelo;

public class Principal {
    public static void main(String[] args){
        Producto p1 = new Producto("12", "Arroz", 2.75);
        Producto p2 = new Producto("35", "Jugo", 1.25);

        Carrito carrito = new Carrito();

        ItemCarrito item1 = new ItemCarrito(p1, 55);
        ItemCarrito item2 = new ItemCarrito(p2, 90);

        carrito.agregarProducto(item1);
        carrito.agregarProducto(item2);

        System.out.println(item1);
        System.out.println(item2);

        System.out.println("Total: $" + carrito.calcularTotal());
    }
}