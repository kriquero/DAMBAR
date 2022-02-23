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
public class VerProducto extends javax.swing.JPanel {

    /**
     * Creates new form VerProducto
     */
    public VerProducto() {
        initComponents();
    }
private void actualizaTabla(){
        String[] datos  = new String[2];
        String[] titulos = new String[] {"Id","Nombre","Tipo","Precio","Stock"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        ProductoClient pc = new ProductoClient();
        for(Producto m : pc.getProductos()){
        datos[0]=String.valueOf(m.getId());
        datos[1]=String.valueOf(m.getNombre());
        datos[2]=String.valueOf(m.getTipo());
        datos[3]=String.valueOf(m.getPrecio());
        datos[4]=String.valueOf(m.getStock());
        
        modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerProductoScrollPanel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        VerProductoActualizarTableButton = new javax.swing.JButton();
        VerProductoCerrarButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        VerProductoScrollPanel.setPreferredSize(new java.awt.Dimension(580, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName(""); // NOI18N
        jTable1.setPreferredSize(new java.awt.Dimension(580, 200));
        jTable1.setRequestFocusEnabled(false);
        VerProductoScrollPanel.setViewportView(jTable1);

        VerProductoActualizarTableButton.setText("Actualizar");
        VerProductoActualizarTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProductoActualizarTableButtonActionPerformed(evt);
            }
        });

        VerProductoCerrarButton.setText("Cerrar");
        VerProductoCerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProductoCerrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerProductoScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VerProductoActualizarTableButton)
                        .addGap(18, 18, 18)
                        .addComponent(VerProductoCerrarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerProductoScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerProductoCerrarButton)
                    .addComponent(VerProductoActualizarTableButton))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VerProductoCerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProductoCerrarButtonActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_VerProductoCerrarButtonActionPerformed

    private void VerProductoActualizarTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProductoActualizarTableButtonActionPerformed
        actualizaTabla();
    }//GEN-LAST:event_VerProductoActualizarTableButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VerProductoActualizarTableButton;
    private javax.swing.JButton VerProductoCerrarButton;
    private javax.swing.JScrollPane VerProductoScrollPanel;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
