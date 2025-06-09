package ec.ups.edu.poo;

public class Principal {
    Producto p1 = new Producto(12, "Arroz", 2.5);
    Producto p2 = new Producto(35, "Jugo", 1.75);

    ItemCarrito item1 = new ItemCarrito(p1, 50);
    ItemCarrito item2 = new ItemCarrito(p2, 80);


}