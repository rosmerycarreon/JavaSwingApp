
package com.rosmery.pe.presentacion;

import com.rosmery.pe.cmodelo.TipoDocumento;
import com.rosmery.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JOptionPane;


public class JPTipoDocumento extends javax.swing.JPanel {
 TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    String idTipoDocumento;
    
    public JPTipoDocumento() {
        initComponents();
        listarTipoDocumento();
        
    }
    
    public void listarTipoDocumento(){
        tdbo.listarTipoDocumento(tablaTipoDocumento);
    }

//    int seleccion = tablaTipoDocumento.rowAtPoint(evt.getPoint());
//    idTipoDocumento = tablaTipoDocumento.getValueAT(seleccion, 0)+"";
//    txtNombre.setText(tablaTipoDocumento.getValueAT(seleccion, 1)+"");
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoDocumento = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        textnombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtsigla = new javax.swing.JTextField();
        textsigla = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textorden = new javax.swing.JLabel();
        txtorden = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        textestado = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        textfecharegistro = new javax.swing.JLabel();
        txtfecharegistro = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        textfechaactualiza = new javax.swing.JLabel();
        txtfechaactualiza = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnguardar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CRUD Tipo Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 563, 79));

        tablaTipoDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaTipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTipoDocumentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTipoDocumento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 110, 600, -1));

        btneliminar.setBackground(new java.awt.Color(252, 11, 129));
        btneliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 130, 40));

        btnmodificar.setBackground(new java.awt.Color(102, 153, 255));
        btnmodificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 130, 40));

        btnlimpiar.setBackground(new java.awt.Color(255, 102, 102));
        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 90, 30));

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombre.setBorder(null);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 400, -1));

        textnombre.setForeground(new java.awt.Color(153, 153, 153));
        textnombre.setText("NOMBRE");
        jPanel1.add(textnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 400, -1));

        txtsigla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsigla.setBorder(null);
        txtsigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsiglaActionPerformed(evt);
            }
        });
        jPanel1.add(txtsigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 400, -1));

        textsigla.setForeground(new java.awt.Color(153, 153, 153));
        textsigla.setText("SIGLA");
        jPanel1.add(textsigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 400, -1));

        textorden.setForeground(new java.awt.Color(153, 153, 153));
        textorden.setText("ORDEN");
        jPanel1.add(textorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        txtorden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtorden.setBorder(null);
        txtorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtordenActionPerformed(evt);
            }
        });
        jPanel1.add(txtorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 400, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 400, -1));

        jLabel5.setText("SIGLA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 400, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 400, -1));

        textestado.setForeground(new java.awt.Color(153, 153, 153));
        textestado.setText("ESTADO");
        jPanel1.add(textestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        txtestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtestado.setBorder(null);
        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 400, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 400, -1));

        textfecharegistro.setForeground(new java.awt.Color(153, 153, 153));
        textfecharegistro.setText("FECHA REGISTRO");
        jPanel1.add(textfecharegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 20));

        txtfecharegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfecharegistro.setBorder(null);
        txtfecharegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecharegistroActionPerformed(evt);
            }
        });
        jPanel1.add(txtfecharegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 400, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 400, -1));

        textfechaactualiza.setForeground(new java.awt.Color(153, 153, 153));
        textfechaactualiza.setText("FECHA ACTUALIZA");
        jPanel1.add(textfechaactualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 20));

        txtfechaactualiza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfechaactualiza.setBorder(null);
        txtfechaactualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaactualizaActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechaactualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 400, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 400, -1));

        btnguardar.setBackground(new java.awt.Color(153, 204, 255));
        btnguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtsiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsiglaActionPerformed

    private void txtordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtordenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtordenActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoActionPerformed

    private void txtfecharegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecharegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecharegistroActionPerformed

    private void txtfechaactualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaactualizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaactualizaActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
          
     // Código para limpiar los campos de texto
    txtnombre.setText("");
    txtsigla.setText("");
    txtestado.setText("");
    txtorden.setText("");
    txtfecharegistro.setText("");
    txtfechaactualiza.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try{
            
        td.setNombre(txtnombre.getText());
        td.setSigla(txtsigla.getText());
        td.setOrden(Integer.parseInt(txtorden.getText()));
        td.setEstado(txtestado.getText());
        td.setFechaRegistro(txtfecharegistro.getText());
        td.setFechaActualiza(txtfechaactualiza.getText());
        
        tdbo.agregarTipoDocumento(td);
        listarTipoDocumento();
        JOptionPane.showMessageDialog(null, "Guardado");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar");
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed
    public boolean valida(){
           if (txtnombre.getText().equals("")){
               JOptionPane.showMessageDialog(null, "El nombre es requerido" );
             }else if (txtsigla.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "La sigla es requerido");
                  return false;
               }else if (txtorden.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "La Orden es requerido");
                  return false;}
           else if (txtestado.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "La Estado es requerido");
                  return false;}
           else if (txtfecharegistro.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "La Fecha es requerido");
                  return false;}
           else if (txtfechaactualiza.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "La Fecha Actuliza es requerido");
                  return false;}
           
              return true;
          }

    private void tablaTipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTipoDocumentoMouseClicked
        int seleccion = tablaTipoDocumento.rowAtPoint(evt.getPoint());
        idTipoDocumento = tablaTipoDocumento.getValueAt(seleccion, 0)+"";
        txtnombre.setText(tablaTipoDocumento.getValueAt(seleccion, 1)+"");
        txtsigla.setText(tablaTipoDocumento.getValueAt(seleccion, 2)+"");
        txtorden.setText(tablaTipoDocumento.getValueAt(seleccion, 3)+"");
        txtestado.setText(tablaTipoDocumento.getValueAt(seleccion, 4)+"");
        txtfecharegistro.setText(tablaTipoDocumento.getValueAt(seleccion, 5)+"");
        txtfechaactualiza.setText(tablaTipoDocumento.getValueAt(seleccion, 6)+"");
        System.out.print(idTipoDocumento);
    }//GEN-LAST:event_tablaTipoDocumentoMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
        td.setIdTipoDocumento(Integer.parseInt(idTipoDocumento));
        tdbo.eliminarTipoDocumento(td);
        listarTipoDocumento();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       try{
           if(valida()){
        td.setIdTipoDocumento(Integer.parseInt(idTipoDocumento));
        td.setNombre(txtnombre.getText());
        td.setEstado(txtestado.getText());
        td.setOrden(Integer.parseInt(txtorden.getText()));
        td.setSigla(txtsigla.getText());
        td.setFechaRegistro(txtfecharegistro.getText());
        td.setFechaActualiza(txtfechaactualiza.getText());
           
        tdbo.modificarTipoDocumento(td);
        listarTipoDocumento();
        JOptionPane.showMessageDialog(null, ":) Modificado");
           }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, ":( Error: al Modificar");
        }
       
    }//GEN-LAST:event_btnmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tablaTipoDocumento;
    private javax.swing.JLabel textestado;
    private javax.swing.JLabel textfechaactualiza;
    private javax.swing.JLabel textfecharegistro;
    private javax.swing.JLabel textnombre;
    private javax.swing.JLabel textorden;
    private javax.swing.JLabel textsigla;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtfechaactualiza;
    private javax.swing.JTextField txtfecharegistro;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtorden;
    private javax.swing.JTextField txtsigla;
    // End of variables declaration//GEN-END:variables

}
