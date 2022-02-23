/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.augustotwelve.screens;

import clients.MesaClient;
import javax.swing.table.DefaultTableModel;
import models.Mesa;

/**
 *
 * @author dam_eml
 */
public class modMesa extends javax.swing.JPanel {

    Mesa mesaAModificar;
    /**
     * Creates new form AddMesa
     */
    public modMesa() {
        initComponents();
        actualizaTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cerrar = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setToolTipText("EL nuevo estado de la mesa");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(580, 400));

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
        jTable1.setToolTipText("Selecciona la mesa a editar");
        jTable1.setPreferredSize(new java.awt.Dimension(580, 200));
        jTable1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        Cerrar.setText("Cerrar");
        Cerrar.setToolTipText("Cerrar panel");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        modify.setText("Modificar");
        modify.setToolTipText("Edita la mesa seleccionada");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupada", "Reservada" }));
        jComboBox1.setToolTipText("Nuevo estado de la mesa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modify)
                        .addGap(18, 18, 18)
                        .addComponent(Cerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cerrar)
                    .addComponent(modify)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CerrarActionPerformed

    private void actualizaTabla(){
        String[] datos  = new String[2];
        String[] titulos = new String[] {"Id","Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        MesaClient mc = new MesaClient();
        for(Mesa m : mc.getMesas()){
        datos[0]=String.valueOf(m.getId());
        datos[1]=m.getEstado();
        modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
    
    private void buscaaa(long id){
        MesaClient mc = new MesaClient();
    for(Mesa m : mc.getMesas()){
        
        if(m.getId()==id)
        mesaAModificar = m;
    }
    
    }
    
    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        MesaClient mc = new MesaClient();
        buscaaa(Long.parseLong((String)jTable1.getValueAt(jTable1.getSelectedRow(),0)));
        Mesa m = mesaAModificar;
        System.out.println(m.toString());
        m.setEstado(jComboBox1.getSelectedItem().toString());
        m.setId(Long.parseLong((String)jTable1.getValueAt(jTable1.getSelectedRow(),0)));
        
        mc.modificaMesa(Long.parseLong((String)jTable1.getValueAt(jTable1.getSelectedRow(),0)), m);
        
        
    }//GEN-LAST:event_modifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modify;
    // End of variables declaration//GEN-END:variables
}
