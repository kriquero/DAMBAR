/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.augustotwelve.screens;

/**
 *
 * @author dam_mml
 */
public class ModificarProducto extends javax.swing.JPanel {

    /**
     * Creates new form ModificarProducto
     */
    public ModificarProducto() {
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

        jLabel3 = new javax.swing.JLabel();
        ModificarProductoCerrarButton = new javax.swing.JButton();
        ModificarProductoModificarButton = new javax.swing.JButton();
        ModificarProductoScrollPanelTable = new javax.swing.JScrollPane();
        ModificarProductoTable = new javax.swing.JTable();
        ModificarProductoScrollPanelDescripcion = new javax.swing.JScrollPane();
        ModificarProductoDescripcion = new javax.swing.JTextArea();
        ModificarProductoScrollPanelImagen = new javax.swing.JScrollPane();
        ModificarProductoImagen = new javax.swing.JTextArea();
        ModificarProductoTipo = new javax.swing.JTextField();
        ModificarProductoNombre = new javax.swing.JTextField();
        ModificarProductoStock = new javax.swing.JSpinner();
        ModificarProductoPrecio = new javax.swing.JSpinner();
        ModificarProductoNombreLabel = new javax.swing.JLabel();
        ModificarProductoDescripcionLabel = new javax.swing.JLabel();
        ModificarProductoPrecioLabel = new javax.swing.JLabel();
        ModificarProductoStockLabel = new javax.swing.JLabel();
        ModificarProductoTipoLabel = new javax.swing.JLabel();
        ModificarProductoImagenLabel = new javax.swing.JLabel();
        ModificarProductoAlergenosLabel = new javax.swing.JLabel();
        ModificarProductoAlergenosPanel = new javax.swing.JPanel();
        ModificarProductoSesamo = new javax.swing.JCheckBox();
        ModificarProductoMostaza = new javax.swing.JCheckBox();
        ModificarProductoApio = new javax.swing.JCheckBox();
        ModificarProductoFrutosCascara = new javax.swing.JCheckBox();
        ModificarProductoLacteos = new javax.swing.JCheckBox();
        ModificarProductoSoja = new javax.swing.JCheckBox();
        ModificarProductoCacahuetes = new javax.swing.JCheckBox();
        ModificarProductoPescado = new javax.swing.JCheckBox();
        ModificarProductoHuevo = new javax.swing.JCheckBox();
        ModificarProductoCrustaceos = new javax.swing.JCheckBox();
        ModificarProductoGluten = new javax.swing.JCheckBox();
        ModificarProductoAltramuces = new javax.swing.JCheckBox();
        ModificarProductoMoluscos = new javax.swing.JCheckBox();
        ModificarProductoAzufreSulfitos = new javax.swing.JCheckBox();

        jLabel3.setText("Descripción");

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        ModificarProductoCerrarButton.setText("Cerrar");
        ModificarProductoCerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoCerrarButtonActionPerformed(evt);
            }
        });

        ModificarProductoModificarButton.setText("Modificar");
        ModificarProductoModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoModificarButtonActionPerformed(evt);
            }
        });

        ModificarProductoScrollPanelTable.setPreferredSize(new java.awt.Dimension(580, 400));

        ModificarProductoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ModificarProductoTable.setPreferredSize(new java.awt.Dimension(580, 200));
        ModificarProductoTable.setRequestFocusEnabled(false);
        ModificarProductoScrollPanelTable.setViewportView(ModificarProductoTable);

        ModificarProductoDescripcion.setColumns(20);
        ModificarProductoDescripcion.setRows(5);
        ModificarProductoScrollPanelDescripcion.setViewportView(ModificarProductoDescripcion);

        ModificarProductoImagen.setColumns(20);
        ModificarProductoImagen.setRows(5);
        ModificarProductoScrollPanelImagen.setViewportView(ModificarProductoImagen);

        ModificarProductoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoTipoActionPerformed(evt);
            }
        });

        ModificarProductoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoNombreActionPerformed(evt);
            }
        });

        ModificarProductoStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        ModificarProductoPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        ModificarProductoNombreLabel.setText("Nombre");

        ModificarProductoDescripcionLabel.setText("Descripción");

        ModificarProductoPrecioLabel.setText("Precio");

        ModificarProductoStockLabel.setText("Stock");

        ModificarProductoTipoLabel.setText("Tipo");

        ModificarProductoImagenLabel.setText("Imagen (URL)");

        ModificarProductoAlergenosLabel.setText("Alergenos");

        ModificarProductoAlergenosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ModificarProductoSesamo.setText("Sesamo");
        ModificarProductoSesamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoSesamoActionPerformed(evt);
            }
        });

        ModificarProductoMostaza.setText("Mostaza");
        ModificarProductoMostaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoMostazaActionPerformed(evt);
            }
        });

        ModificarProductoApio.setText("Apio");
        ModificarProductoApio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoApioActionPerformed(evt);
            }
        });

        ModificarProductoFrutosCascara.setText("Frutos con cascara");
        ModificarProductoFrutosCascara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoFrutosCascaraActionPerformed(evt);
            }
        });

        ModificarProductoLacteos.setText("Lácteos");
        ModificarProductoLacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoLacteosActionPerformed(evt);
            }
        });

        ModificarProductoSoja.setText("Soja");
        ModificarProductoSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoSojaActionPerformed(evt);
            }
        });

        ModificarProductoCacahuetes.setText("Cacahuetes");
        ModificarProductoCacahuetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoCacahuetesActionPerformed(evt);
            }
        });

        ModificarProductoPescado.setText("Pescado");
        ModificarProductoPescado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoPescadoActionPerformed(evt);
            }
        });

        ModificarProductoHuevo.setText("Huevo");
        ModificarProductoHuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoHuevoActionPerformed(evt);
            }
        });

        ModificarProductoCrustaceos.setText("Crustáceos ");
        ModificarProductoCrustaceos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoCrustaceosActionPerformed(evt);
            }
        });

        ModificarProductoGluten.setText("Gluten");
        ModificarProductoGluten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoGlutenActionPerformed(evt);
            }
        });

        ModificarProductoAltramuces.setText("Altramuces");
        ModificarProductoAltramuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoAltramucesActionPerformed(evt);
            }
        });

        ModificarProductoMoluscos.setText("Moluscos");
        ModificarProductoMoluscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoMoluscosActionPerformed(evt);
            }
        });

        ModificarProductoAzufreSulfitos.setText("Dioxido de azufre y sulfitos");
        ModificarProductoAzufreSulfitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoAzufreSulfitosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarProductoAlergenosPanelLayout = new javax.swing.GroupLayout(ModificarProductoAlergenosPanel);
        ModificarProductoAlergenosPanel.setLayout(ModificarProductoAlergenosPanelLayout);
        ModificarProductoAlergenosPanelLayout.setHorizontalGroup(
            ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarProductoAlergenosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarProductoSesamo)
                    .addComponent(ModificarProductoMostaza)
                    .addComponent(ModificarProductoApio)
                    .addComponent(ModificarProductoMoluscos))
                .addGap(18, 18, 18)
                .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarProductoLacteos)
                    .addComponent(ModificarProductoSoja)
                    .addComponent(ModificarProductoHuevo)
                    .addComponent(ModificarProductoGluten))
                .addGap(18, 18, 18)
                .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarProductoCacahuetes)
                    .addComponent(ModificarProductoPescado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ModificarProductoAltramuces)
                        .addComponent(ModificarProductoCrustaceos)))
                .addGap(18, 18, 18)
                .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarProductoAzufreSulfitos)
                    .addComponent(ModificarProductoFrutosCascara))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        ModificarProductoAlergenosPanelLayout.setVerticalGroup(
            ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarProductoAlergenosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarProductoAlergenosPanelLayout.createSequentialGroup()
                        .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModificarProductoCacahuetes)
                            .addComponent(ModificarProductoAzufreSulfitos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModificarProductoPescado)
                            .addComponent(ModificarProductoFrutosCascara))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModificarProductoCrustaceos))
                    .addGroup(ModificarProductoAlergenosPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ModificarProductoHuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModificarProductoLacteos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModificarProductoSoja))
                    .addGroup(ModificarProductoAlergenosPanelLayout.createSequentialGroup()
                        .addComponent(ModificarProductoSesamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModificarProductoMostaza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModificarProductoApio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarProductoAlergenosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModificarProductoMoluscos)
                        .addComponent(ModificarProductoGluten))
                    .addComponent(ModificarProductoAltramuces))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModificarProductoNombreLabel)
                            .addComponent(ModificarProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ModificarProductoScrollPanelDescripcion)
                                .addComponent(ModificarProductoDescripcionLabel)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModificarProductoTipoLabel)
                            .addComponent(ModificarProductoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ModificarProductoScrollPanelImagen)
                                .addComponent(ModificarProductoImagenLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModificarProductoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificarProductoPrecioLabel)
                            .addComponent(ModificarProductoStockLabel)
                            .addComponent(ModificarProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ModificarProductoModificarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ModificarProductoCerrarButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ModificarProductoAlergenosLabel)
                                .addComponent(ModificarProductoAlergenosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(11, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ModificarProductoScrollPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ModificarProductoNombreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModificarProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModificarProductoDescripcionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModificarProductoScrollPanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ModificarProductoTipoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModificarProductoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ModificarProductoImagenLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModificarProductoScrollPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ModificarProductoPrecioLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModificarProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModificarProductoStockLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModificarProductoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(ModificarProductoAlergenosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModificarProductoAlergenosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarProductoCerrarButton)
                    .addComponent(ModificarProductoModificarButton))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ModificarProductoScrollPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarProductoCerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoCerrarButtonActionPerformed
        this.setSize(0,0);
    }//GEN-LAST:event_ModificarProductoCerrarButtonActionPerformed

    private void ModificarProductoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoNombreActionPerformed

    private void ModificarProductoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoTipoActionPerformed

    private void ModificarProductoSesamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoSesamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoSesamoActionPerformed

    private void ModificarProductoMostazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoMostazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoMostazaActionPerformed

    private void ModificarProductoApioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoApioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoApioActionPerformed

    private void ModificarProductoFrutosCascaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoFrutosCascaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoFrutosCascaraActionPerformed

    private void ModificarProductoLacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoLacteosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoLacteosActionPerformed

    private void ModificarProductoSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoSojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoSojaActionPerformed

    private void ModificarProductoCacahuetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoCacahuetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoCacahuetesActionPerformed

    private void ModificarProductoPescadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoPescadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoPescadoActionPerformed

    private void ModificarProductoHuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoHuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoHuevoActionPerformed

    private void ModificarProductoCrustaceosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoCrustaceosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoCrustaceosActionPerformed

    private void ModificarProductoGlutenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoGlutenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoGlutenActionPerformed

    private void ModificarProductoAltramucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoAltramucesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoAltramucesActionPerformed

    private void ModificarProductoMoluscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoMoluscosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoMoluscosActionPerformed

    private void ModificarProductoAzufreSulfitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoAzufreSulfitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoAzufreSulfitosActionPerformed

    private void ModificarProductoModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoModificarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarProductoModificarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ModificarProductoAlergenosLabel;
    private javax.swing.JPanel ModificarProductoAlergenosPanel;
    private javax.swing.JCheckBox ModificarProductoAltramuces;
    private javax.swing.JCheckBox ModificarProductoApio;
    private javax.swing.JCheckBox ModificarProductoAzufreSulfitos;
    private javax.swing.JCheckBox ModificarProductoCacahuetes;
    private javax.swing.JButton ModificarProductoCerrarButton;
    private javax.swing.JCheckBox ModificarProductoCrustaceos;
    private javax.swing.JTextArea ModificarProductoDescripcion;
    private javax.swing.JLabel ModificarProductoDescripcionLabel;
    private javax.swing.JCheckBox ModificarProductoFrutosCascara;
    private javax.swing.JCheckBox ModificarProductoGluten;
    private javax.swing.JCheckBox ModificarProductoHuevo;
    private javax.swing.JTextArea ModificarProductoImagen;
    private javax.swing.JLabel ModificarProductoImagenLabel;
    private javax.swing.JCheckBox ModificarProductoLacteos;
    private javax.swing.JButton ModificarProductoModificarButton;
    private javax.swing.JCheckBox ModificarProductoMoluscos;
    private javax.swing.JCheckBox ModificarProductoMostaza;
    private javax.swing.JTextField ModificarProductoNombre;
    private javax.swing.JLabel ModificarProductoNombreLabel;
    private javax.swing.JCheckBox ModificarProductoPescado;
    private javax.swing.JSpinner ModificarProductoPrecio;
    private javax.swing.JLabel ModificarProductoPrecioLabel;
    private javax.swing.JScrollPane ModificarProductoScrollPanelDescripcion;
    private javax.swing.JScrollPane ModificarProductoScrollPanelImagen;
    private javax.swing.JScrollPane ModificarProductoScrollPanelTable;
    private javax.swing.JCheckBox ModificarProductoSesamo;
    private javax.swing.JCheckBox ModificarProductoSoja;
    private javax.swing.JSpinner ModificarProductoStock;
    private javax.swing.JLabel ModificarProductoStockLabel;
    private javax.swing.JTable ModificarProductoTable;
    private javax.swing.JTextField ModificarProductoTipo;
    private javax.swing.JLabel ModificarProductoTipoLabel;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
