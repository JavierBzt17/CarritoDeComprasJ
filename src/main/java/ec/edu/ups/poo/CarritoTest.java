package ec.edu.ups.poo;

import ec.edu.ups.poo.modelo.ItemCarrito;
import ec.edu.ups.poo.modelo.Producto;
import ec.edu.ups.poo.servicio.CarritoServiceImpl;

public class CarritoTest {

    public static void main(String[] args) {

        // Crear carrito
        CarritoServiceImpl carrito = new CarritoServiceImpl() {
            @Override
            public void eliminarProducto(int codigoProducto) {

            }
        };

        // Crear productos
        Producto p1 = new Producto("1", "Mouse", 15.25);
        Producto p2 = new Producto("2", "Teclado", 25.70);

        // Agregar productos al carrito
        carrito.agregarProducto();
        carrito.agregarProducto();

        // Mostrar ítems
        System.out.println("Contenido del carrito:");
        for (ItemCarrito item : carrito.obtenerItems()) {
            System.out.println("- " + item);
        }

        // Calcular total
        double total = carrito.calcularTotal();
        System.out.println("Total: $" + total);

        // Verificar si está vacío
        System.out.println("¿Carrito vacío? " + carrito.estaVacio());

        // Eliminar producto y vaciar carrito
        carrito.eliminarProducto(1);
        carrito.vaciarCarrito();

        System.out.println("Carrito vaciado. ¿Vacío ahora? " + carrito.estaVacio());
    }
}