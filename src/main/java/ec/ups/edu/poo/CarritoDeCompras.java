package ec.ups.edu.poo;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ItemCarrito> items;

    public CarritoDeCompras(List<ItemCarrito> items) {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        for (ItemCarrito item : items){
            if (item.getProducto().getCodigo() == producto.getCodigo()){
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(producto, cantidad));
    }

    public void eliminarProducto(int codigo){
        items.removeIf(item -> item.getProducto().getCodigo() == codigo);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemCarrito item : items){
            total += item.subtotal();
        }
        return total;
    }

    public void limpiar(){
        items.clear();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
}
