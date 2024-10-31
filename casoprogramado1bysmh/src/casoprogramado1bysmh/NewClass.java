/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramado1bysmh;

import javax.swing.JOptionPane;

/**
 *
 * @author majag
 */
public class NewClass {
    public static void main(String[] args) {
        String nombreCliente;
        int numCedula;
        int codigo;
        int monto;
        String cliente1;
        String cliente2;
        String cliente3;
        String cliente4;
        String cliente5;
        
        nombreCliente = JOptionPane.showInputDialog("Ingrese el nombreCliente");
        numCedula = Interger.parseInt(JOptionPane.showInputDialog("Ingrese el numCedula"));
        codigo = Interger.parseInt(JOptionPane.showInputDialog("Ingrese el codigo"));
        monto = Interger.parseInt(JOptionPane.showInputDialog("Ingrese el monto"));
        cliente1 = JOptionPane.showInputDialog("Ingrese el cliente1");
        cliente2 = JOptionPane.showInputDialog("Ingrese el cliente2");
        cliente3 = JOptionPane.showInputDialog("Ingrese el cliente3");
        cliente4 = JOptionPane.showInputDialog("Ingrese el cliente4");
        cliente5 = JOptionPane.showInputDialog("Ingrese el cliente5");
        
        int codigo = Interger.parseInt(codigo);
        double ventas = Double.parseDouble(ventas);
        double bonificacion = 0.0;
        if (ventas > 50000)
            bonificacion = ventas * 0.05;
        if (ventas > 20000)
            bonificacion += 8;
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        
}
}
