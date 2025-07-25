package ec.edu.ups.poo.controller;

import ec.edu.ups.poo.dao.ProductoDAO;
import ec.edu.ups.poo.modelo.Producto;
import ec.edu.ups.poo.vista.ProductoAnadirView;
import ec.edu.ups.poo.vista.ProductoListaView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProductoController {

    private final ProductoAnadirView productoAnadirView;
    private final ProductoListaView productoListaView;
    private final ProductoDAO productoDAO;

    public ProductoController(ProductoDAO productoDAO, ProductoAnadirView productoView, ProductoListaView productoListaView) {
        this.productoDAO = productoDAO;
        this.productoListaView = productoListaView;
        this.productoAnadirView = productoView;
        configurarEventos();
    }

    private void configurarEventos() {
        productoAnadirView.getBtnAceptar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarProducto();
            }
        });

        productoListaView.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });


    }

    private void buscarProducto() {
        String nombre = new ProductoListaView().getTxtBuscar().getText();

        List<Producto> productoEncontrado = productoDAO.buscarPorNombre(nombre);
        productoListaView.cargarDatos(productoEncontrado);
    }

    private void listarProductos(){
        List<Producto> productos = productoDAO.listarTodos();
        productoListaView.cargarDatos(productos);
    }

    private void guardarProducto() {
        String codigo = String.valueOf(productoAnadirView.getTxtCodigo().getText());
        String nombre = productoAnadirView.getTxtNombre().getText();
        double precio = Double.parseDouble(productoAnadirView.getTxtPrecio().getText());

        productoDAO.crear(new Producto(codigo, nombre, precio));
        productoAnadirView.mostrarMensaje("Producto guardado correctamente");
        productoAnadirView.limpiarCampos();
        productoAnadirView.mostrarProductos(productoDAO.listarTodos());
    }

}
