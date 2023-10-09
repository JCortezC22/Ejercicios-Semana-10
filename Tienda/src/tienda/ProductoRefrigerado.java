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
class ProductoRefrigerado extends Producto {
    private String codigoSupervision;

    public ProductoRefrigerado(int lote, String fechaCaducidad, String codigoSupervision) {
        super(lote, fechaCaducidad);
        this.codigoSupervision = codigoSupervision;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Código: " + codigoSupervision, "Información del Producto Refrigerado", JOptionPane.INFORMATION_MESSAGE);
    }
}