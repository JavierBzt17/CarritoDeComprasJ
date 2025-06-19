package ec.edu.ups.poo.vista;

import javax.swing.*;

public class CarritoView extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox conIVACheckBox;
    private JCheckBox sinIVACheckBox;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JButton listarButton;
    private JLabel lblNombre;
    private JPanel panelPrincipal;

    public CarritoView(){
        setContentPane(panelPrincipal);
        setTitle("Carrito de Compras:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args){
        new CarritoView();
    }
}
