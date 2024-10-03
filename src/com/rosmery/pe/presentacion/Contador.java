/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rosmery.pe.presentacion;

public class Contador extends javax.swing.JPanel {

  
    public Contador() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnsumar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        jTextresultado1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 50)); // NOI18N
        jLabel1.setText("CONTADOR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 270, 60));

        btnsumar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsumar.setText("SUMAR + 1");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });
        add(btnsumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 130, 50));

        btnrestar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnrestar.setText("RESTAR - 1");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });
        add(btnrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 120, 50));

        jTextresultado1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextresultado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextresultado1.setText("0");
        jTextresultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextresultado1ActionPerformed(evt);
            }
        });
        add(jTextresultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 280, 180));
    }// </editor-fold>//GEN-END:initComponents
    int contador = 0;
    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed

    contador++;

    jTextresultado1.setText(String.valueOf(contador));

    }//GEN-LAST:event_btnsumarActionPerformed
  
    private void jTextresultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextresultado1ActionPerformed
        //resultado
    }//GEN-LAST:event_jTextresultado1ActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        contador--;

    jTextresultado1.setText(String.valueOf(contador));
    }//GEN-LAST:event_btnrestarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextresultado1;
    // End of variables declaration//GEN-END:variables
}
