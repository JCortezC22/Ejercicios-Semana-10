/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(int lote, String fechaCaducidad, String fechaEnvasado, String paisOrigen) {
        super(lote, fechaCaducidad);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        String info = "Fecha de Envasado: " + fechaEnvasado + "\nPaís de Origen: " + paisOrigen;
        JOptionPane.showMessageDialog(null, info, "Información del Producto Fresco", JOptionPane.INFORMATION_MESSAGE);
    }
}
