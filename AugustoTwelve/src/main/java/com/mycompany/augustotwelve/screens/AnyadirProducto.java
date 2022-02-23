/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.augustotwelve.screens;

import clients.ProductoClient;
import javax.swing.table.DefaultTableModel;
import models.Producto;

/**
 *
 * @author dam_mml
 */
public class AnyadirProducto extends javax.swing.JPanel {

    /**
     * Creates new form AnyadirProducto
     */
    public AnyadirProducto() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnyadirProductoScrollPanelImagen = new javax.swing.JScrollPane();
        AnyadirProductoImagen = new javax.swing.JTextArea();
        AnyadirProductoScrollPanelDescripcion = new javax.swing.JScrollPane();
        AnyadirProductoDescripcion = new javax.swing.JTextArea();
        AnyadirProductoCerrarButton = new javax.swing.JButton();
        AnyadirProductoInsertarButton = new javax.swing.JButton();
        AnyadirProductoPrecio = new javax.swing.JSpinner();
        AnyadirProductoStock = new javax.swing.JSpinner();
        AnyadirProductonombre = new javax.swing.JTextField();
        AnyadirProductoTipo = new javax.swing.JTextField();
        AnyadirProductoImagenLabel = new javax.swing.JLabel();
        AnyadirProductoPrecioLabel = new javax.swing.JLabel();
        AnyadirProductoStockLabel = new javax.swing.JLabel();
        AnyadirProductoNombreLabel = new javax.swing.JLabel();
        AnyadirProductoDescripcionLabel = new javax.swing.JLabel();
        AnyadirProductoTipoLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        AnyadirProductoImagen.setColumns(20);
        AnyadirProductoImagen.setRows(5);
        AnyadirProductoImagen.setToolTipText("URL de la imagen");
        AnyadirProductoScrollPanelImagen.setViewportView(AnyadirProductoImagen);

        AnyadirProductoDescripcion.setColumns(20);
        AnyadirProductoDescripcion.setRows(5);
        AnyadirProductoDescripcion.setToolTipText("Descripción");
        AnyadirProductoScrollPanelDescripcion.setViewportView(AnyadirProductoDescripcion);

        AnyadirProductoCerrarButton.setText("Cerrar");
        AnyadirProductoCerrarButton.setToolTipText("Cerrar panel");
        AnyadirProductoCerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnyadirProductoCerrarButtonActionPerformed(evt);
            }
        });

        AnyadirProductoInsertarButton.setText("Insertar");
        AnyadirProductoInsertarButton.setToolTipText("Crear producto");
        AnyadirProductoInsertarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnyadirProductoInsertarButtonActionPerformed(evt);
            }
        });

        AnyadirProductoPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        AnyadirProductoPrecio.setToolTipText("Precio");

        AnyadirProductoStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        AnyadirProductoStock.setToolTipText("Stock");

        AnyadirProductonombre.setToolTipText("Nombre");
        AnyadirProductonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnyadirProductonombreActionPerformed(evt);
            }
        });

        AnyadirProductoTipo.setToolTipText("Tipo");
        AnyadirProductoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnyadirProductoTipoActionPerformed(evt);
            }
        });

        AnyadirProductoImagenLabel.setText("Imagen (URL)");

        AnyadirProductoPrecioLabel.setText("Precio");

        AnyadirProductoStockLabel.setText("Stock");

        AnyadirProductoNombreLabel.setText("Nombre");

        AnyadirProductoDescripcionLabel.setText("Descripción");

        AnyadirProductoTipoLabel.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AnyadirProductoNombreLabel)
                        .addComponent(AnyadirProductonombre)
                        .addComponent(AnyadirProductoDescripcionLabel)
                        .addComponent(AnyadirProductoScrollPanelDescripcion))
                    .addComponent(AnyadirProductoPrecioLabel)
                    .addComponent(AnyadirProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnyadirProductoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnyadirProductoStockLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AnyadirProductoInsertarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnyadirProductoCerrarButton))
                            .addComponent(AnyadirProductoTipoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnyadirProductoTipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnyadirProductoImagenLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnyadirProductoScrollPanelImagen, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(133, 215, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AnyadirProductoNombreLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnyadirProductonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AnyadirProductoDescripcionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnyadirProductoScrollPanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(AnyadirProductoTipoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnyadirProductoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AnyadirProductoImagenLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnyadirProductoScrollPanelImagen)))
                        .addGap(33, 33, 33)
                        .addComponent(AnyadirProductoPrecioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnyadirProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnyadirProductoStockLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnyadirProductoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnyadirProductoInsertarButton)
                    .addComponent(AnyadirProductoCerrarButton))
                .addGap(120, 120, 120))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AnyadirProductoCerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnyadirProductoCerrarButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_AnyadirProductoCerrarButtonActionPerformed

    private void AnyadirProductoInsertarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnyadirProductoInsertarButtonActionPerformed
        
        Producto p = new Producto(
        AnyadirProductonombre.getText(),
                AnyadirProductoDescripcion.getText(),
                AnyadirProductoPrecio.getComponentCount(),
                AnyadirProductoStock.getComponentCount(),
                AnyadirProductoTipo.getText(),
                AnyadirProductoImagen.getText()
                
        );
        
        ProductoClient pc = new ProductoClient();
        
        pc.crearProducto(p);
        
        
    }//GEN-LAST:event_AnyadirProductoInsertarButtonActionPerformed

    private void AnyadirProductonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnyadirProductonombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnyadirProductonombreActionPerformed

    private void AnyadirProductoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnyadirProductoTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnyadirProductoTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnyadirProductoCerrarButton;
    private javax.swing.JTextArea AnyadirProductoDescripcion;
    private javax.swing.JLabel AnyadirProductoDescripcionLabel;
    private javax.swing.JTextArea AnyadirProductoImagen;
    private javax.swing.JLabel AnyadirProductoImagenLabel;
    private javax.swing.JButton AnyadirProductoInsertarButton;
    private javax.swing.JLabel AnyadirProductoNombreLabel;
    private javax.swing.JSpinner AnyadirProductoPrecio;
    private javax.swing.JLabel AnyadirProductoPrecioLabel;
    private javax.swing.JScrollPane AnyadirProductoScrollPanelDescripcion;
    private javax.swing.JScrollPane AnyadirProductoScrollPanelImagen;
    private javax.swing.JSpinner AnyadirProductoStock;
    private javax.swing.JLabel AnyadirProductoStockLabel;
    private javax.swing.JTextField AnyadirProductoTipo;
    private javax.swing.JLabel AnyadirProductoTipoLabel;
    private javax.swing.JTextField AnyadirProductonombre;
    // End of variables declaration//GEN-END:variables
}
