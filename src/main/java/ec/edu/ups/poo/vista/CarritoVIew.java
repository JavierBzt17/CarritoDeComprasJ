package ec.edu.ups.poo.vista;

import javax.swing.*;

public class CarritoVIew extends JFrame{
    private JPanel panelPrincipal;
    private JTextField textField1;
    private JTextField textField2;
    private JButton agregarProductoButton;
    private JButton listarProductosButton;
    private JButton eliminarProductosButton;
    private JLabel lblNombre;
    private JLabel lblCantidad;
    private JCheckBox siCheckBox;
    private JCheckBox noCheckBox;

    public CarritoVIew(){
        setContentPane(panelPrincipal);
        setTitle("Carrito de compras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new CarritoVIew();
    }

    private void createUIComponents() {
    }
}