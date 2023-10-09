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

class Producto {
    protected final int lote;
    protected final String fechaCaducidad;

    public Producto(int lote, String fechaCaducidad) {
        this.lote = lote;
        this.fechaCaducidad = fechaCaducidad;
    }

    public void mostrarInformacion() {
        String info = "Número de Lote: " + lote + "\nFecha de Caducidad: " + fechaCaducidad;
        JOptionPane.showMessageDialog(null, info, "Información del Producto", JOptionPane.INFORMATION_MESSAGE);
    }
}