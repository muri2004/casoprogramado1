/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoprogramado1bysmh;

/**
 *
 * @author majag
 */
public class Casoprogramado1bysmh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
        public String nombreCliente;
        public int numCedula;
        public int codigo;
        public int monto;
        public String cliente1;
        public String cliente2;
        public String cliente3;
        public String cliente4;
        public String cliente5;

    public NewClassramado1bysmh(String nombreCliente, int numCedula, int codigo, int monto) {
        this.nombreCliente = nombreCliente;
        this.numCedula = numCedula;
        this.codigo = codigo;
        this.monto = monto;
        
        this.nombreCliente = "no se ingreso";
        this.numCedula = "no se ingreso";
        this.codigo = 0;
        this.monto = 0;
        
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getCliente1() {
        return cliente1;
    }

    public void setCliente1(String cliente1) {
        this.cliente1 = cliente1;
    }

    public String getCliente2() {
        return cliente2;
    }

    public void setCliente2(String cliente2) {
        this.cliente2 = cliente2;
    }

    public String getCliente3() {
        return cliente3;
    }

    public void setCliente3(String cliente3) {
        this.cliente3 = cliente3;
    }

    public String getCliente4() {
        return cliente4;
    }

    public void setCliente4(String cliente4) {
        this.cliente4 = cliente4;
    }

    public String getCliente5() {
        return cliente5;
    }

    public void setCliente5(String cliente5) {
        this.cliente5 = cliente5;
    }
    
    }

