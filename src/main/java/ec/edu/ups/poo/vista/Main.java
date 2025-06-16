package ec.edu.ups.poo.vista;

import ec.edu.ups.poo.controller.ProductoController;
import ec.edu.ups.poo.dao.impl.ProductoDAOMemoria;
import ec.edu.ups.poo.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                ProductoAnadirView productoView = new ProductoAnadirView();
                ProductoDAOMemoria productoDAO = new ProductoDAOMemoria() {
                    @Override
                    public Producto buscarPorCodigo(int codigo) {
                        return null;
                    }

                    @Override
                    public void eliminar(int codigo) {

                    }
                };
                ProductoListaView productoListaView = new ProductoListaView();
                new ProductoController(productoDAO, productoView, productoListaView);
            }
        });
    }
}