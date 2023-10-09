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

class ProductoCongelado extends Producto {
    private double temperaturaCongelacion;

    public ProductoCongelado(int lote, String fechaCaducidad, double temperaturaCongelacion) {
        super(lote, fechaCaducidad);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        String info = "Temperatura de Congelación Recomendada: " + temperaturaCongelacion + "°C";
        JOptionPane.showMessageDialog(null, info, "Información del Producto Congelado", JOptionPane.INFORMATION_MESSAGE);
    }
}
